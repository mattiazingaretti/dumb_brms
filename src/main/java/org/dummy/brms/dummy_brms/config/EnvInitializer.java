package org.dummy.brms.dummy_brms.config;

import java.io.IOException;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnvInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>{

    private static final String DEFAULT_SPRING_PROFILE = "dev"; 
    
    static final String SPRING_PROFILES_ACTIVE =  "spring_profiles_active";

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment env = applicationContext.getEnvironment();

        try{
            env.getPropertySources().addFirst(new ResourcePropertySource("classpath:application.properties"));
            String profiles = env.getProperty(SPRING_PROFILES_ACTIVE);
            if (profiles == null) {
                profiles = DEFAULT_SPRING_PROFILE;
            }
            env.setActiveProfiles(profiles.split(","));
            log.info("Activated Spring profiles: "+ env.getProperty(SPRING_PROFILES_ACTIVE));
        }catch(IOException exception){
            log.error("Failed to find properties in classpath");
        }catch(Exception e){
            log.error("Failed to initialize application.", e);
        }
    }

}
