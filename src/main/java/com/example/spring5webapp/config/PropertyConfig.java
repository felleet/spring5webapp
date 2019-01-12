package com.example.spring5webapp.config;

import com.example.spring5webapp.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${db.username}")
    String user;
    @Value("${db.password}")
    String password;
    @Value("${db.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource source = new FakeDataSource();
        source.setUser(user);
        source.setPassword(password);
        source.setDburl(url);
        return source;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {//not needed anymore?
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }
}
