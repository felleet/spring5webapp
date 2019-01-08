package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @Before
    public void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }
}
