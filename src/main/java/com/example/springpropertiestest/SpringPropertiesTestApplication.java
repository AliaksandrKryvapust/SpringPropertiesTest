package com.example.springpropertiestest;

import groupId.artifactId.test.ITestClassA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringPropertiesTestApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringPropertiesTestApplication.class, args);
//    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("properties.xml");

        ITestClassA test = context.getBean(ITestClassA.class);
        System.out.println(test);
    }

}
