package com.spring.basics.springin5steps;

import com.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.spring.basics.springin5steps.xml.XMLPersonDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIn5StepsXMLContextApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			System.out.println(applicationContext.getBeanDefinitionNames());
			XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);
			System.out.println(personDAO);
			System.out.println(personDAO.getJdbcConnection());
		}
	}

}
