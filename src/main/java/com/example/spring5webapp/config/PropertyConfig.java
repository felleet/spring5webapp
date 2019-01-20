package com.example.spring5webapp.config;

import com.example.spring5webapp.examplebeans.FakeDataSource;
import com.example.spring5webapp.examplebeans.FakeExampleConfig;
import com.example.spring5webapp.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Arrays;

@Configuration
public class PropertyConfig {

    @Value("${example.db.username}")
    String user;
    @Value("${example.db.password}")
    String password;
    @Value("${example.db.url}")
    String url;

    @Value("${example.jms.username}")
    String jmsUsername;
    @Value("${example.jms.password}")
    String jmsPassword;
    @Value("${example.jms.url}")
    String jmsUrl;




    @Value("${name}")
    String name;

    @Value("${names}")
    String[] names;

    @Value("${pound_sign}")
    String poundSign;

    @Value("${book.author}")
    String bookAuthor;

    @Value("${book.publisher}")
    String bookPublisher;

    @Autowired
    Book book;

    @Value("${truth}")
    boolean truth;

    @Value("${another_truth}")
    boolean anotherTruth;

    @Value("${more_true}")
    boolean moreTruth;

    @Value("${false}")
    boolean falseVal;

    @Value("${string_val}")
    String stringVal;

    @Value("${colon_string}")
    String colonString;

    @Value("${include_new_lines}")
    String includeNewLines;

    @Value("${ignore_new_lines}")
    String ignoreNewLines;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource source = new FakeDataSource();
        source.setUser(user);
        source.setPassword(password);
        source.setDburl(url);
        return source;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public FakeExampleConfig fakeExampleConfig() {
        FakeExampleConfig config = new FakeExampleConfig();
        config.setName(name);
        config.setNames(names);
        config.setPoundSign(poundSign);
        config.setBookAuthor(bookAuthor);
        config.setBookPublisher(bookPublisher);
        config.setTruth(truth);
        config.setAnotherTruth(anotherTruth);
        config.setMoreTruth(moreTruth);
        config.setFalseVal(falseVal);

        System.out.println("fakeExampleConfig.names=" + Arrays.toString(names));
        System.out.println("fakeExampleConfig.names.class=" + names.getClass());
        for (String name : names) {
            System.out.println("name=" + name);
        }
        System.out.println("fakeExampleConfig.names=============================");
        System.out.println("book:'" + book + "'");


        return config;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }
}
