package com.example.ebelesson22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Developer developer = (Developer) context.getBean("javaDeveloper");

//        System.out.println(developer);

		Position position = context.getBean(Position.class);
		position.printInfo();
	}

}
