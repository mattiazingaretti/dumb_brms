package org.dummy.brms.dummy_brms.auth;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Component
public class JwtServiceImpl {

    @Value("${gs.app.jwtSecret}")
    private String jwtSecret;

    @Value("${gs.app.jwtExpirationMs}")
    private int jwtExpirationMs;

    public String generateToken(String userName) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userName);
    }

    public String generateJwtToken(Authentication authentication) {

        UserDTO userPrincipal = (UserDTO) authentication.getPrincipal();
        Map<String, Object> claims = new HashMap<>();
        claims.put("roles", userPrincipal.getAuthorities());

        return Jwts.builder()
                .setClaims(claims)
                .setSubject((userPrincipal.getEmail()))
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private String createToken(Map<String, Object> claims, String userName) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationMs))
                .signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
    }

    private Key getSignKey() {
        byte[] keyBytes= Decoders.BASE64.decode(jwtSecret);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parserBuilder().setSigningKey(getSignKey()).build().parse(authToken);
            return true;
        } catch (MalformedJwtException e) {
            log.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            log.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            log.error("JWT token is unsupported: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            log.error("JWT claims string is empty: {}", e.getMessage());
        }

        return false;
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }


    public List<SimpleGrantedAuthority> getAuthoritiesFromToken(String token) {
        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(this.getSignKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();

            List<Map<String, String>> rolesObj = (List<Map<String, String>>) claims.get("roles");

            if (rolesObj == null) {
                return Collections.emptyList();
            }

            List<SimpleGrantedAuthority> authorities;

            // Case 2: Roles are stored as a list of maps
            if (rolesObj instanceof List<?>) {
                List<Map<String, String>> roles = (List<Map<String, String>>) rolesObj;
                authorities = roles.stream()
                        .map(role -> new SimpleGrantedAuthority(role.get("authority")))
                        .collect(Collectors.toList());
            } else {
                throw new IllegalArgumentException("Invalid roles format in JWT token");
            }

            return authorities;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
