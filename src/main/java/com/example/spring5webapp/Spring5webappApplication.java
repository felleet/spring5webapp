package com.example.spring5webapp;

import com.example.spring5webapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		String hello = controller.hello();
		System.out.println(hello);
	}
}
