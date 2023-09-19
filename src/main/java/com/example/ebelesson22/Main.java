package com.example.ebelesson22;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Developer developer = (Developer) context.getBean("javaDeveloper");

//        System.out.println(developer);

        Position position = (Position) context.getBean("position");
        position.printInfo();
    }
}
