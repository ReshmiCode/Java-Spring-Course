package com.spring.basics.springin5steps;

import com.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsPropertiesApplication.class, args);
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		String result = service.returnServiceURL();
		System.out.println(result);
	}

}
