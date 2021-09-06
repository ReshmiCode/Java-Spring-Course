package com.spring.basics.springin5steps;

import com.spring.basics.componentscan.ComponentDAO;
import com.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.basics.componentscan")
public class SpringIn5StepsComponentscanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentscanApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentscanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbcConnection());
		LOGGER.info("{}", componentDAO2);
		LOGGER.info("{}", componentDAO2.getJdbcConnection());
	}

}
