package com.example.spring5webapp;

import com.example.spring5webapp.controllers.ConstructorInjectedController;
import com.example.spring5webapp.controllers.MyController;
import com.example.spring5webapp.controllers.PropertyInjectedController;
import com.example.spring5webapp.controllers.SetterInjectedController;
import com.example.spring5webapp.examplebeans.FakeDataSource;
import com.example.spring5webapp.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());


		FakeDataSource dataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(dataSource.getUser());

		FakeJmsBroker broker = ctx.getBean(FakeJmsBroker.class);
		System.out.println(broker.getUsername());
	}
}
