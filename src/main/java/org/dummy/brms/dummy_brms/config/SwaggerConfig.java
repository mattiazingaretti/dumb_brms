package org.dummy.brms.dummy_brms.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Swagger configuration
 * OpenAPI JSON: http://localhost:8080/v3/api-docs
 * Swagger UI: http://localhost:8080/swagger-ui.html
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .packagesToScan("org.dummy.brms.dummy_brms")
                .build();
    }
}