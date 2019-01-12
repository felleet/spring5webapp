package com.example.spring5webapp.config;

import com.example.spring5webapp.repositories.GreetingRepository;
import com.example.spring5webapp.repositories.GreetingRepositoryImpl;
import com.example.spring5webapp.services.GreetingService;
import com.example.spring5webapp.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    GreetingRepository greetingRepository() {
        return new GreetingRepositoryImpl();
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory serviceFactory) {
        return serviceFactory.createGreetService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetService("de");
    }




}
