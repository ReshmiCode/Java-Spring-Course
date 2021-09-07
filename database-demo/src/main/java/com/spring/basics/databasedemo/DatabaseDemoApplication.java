package com.spring.basics.databasedemo;

import com.spring.basics.databasedemo.entity.Person;
import com.spring.basics.databasedemo.jbdc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(" All users -> {}", dao.findAll());
		logger.info(" User id 10001 -> {}", dao.findById(10001));
		logger.info(" Deleting 10002 -> No of Rows Deleted - {}", dao.deleteById(10002));
		logger.info(" Inserting 10005 -> {}", dao.insert(new Person(10005, "Taryn", "Dallas", new Date())));
		logger.info(" Updating 10005 -> {}", dao.update(new Person(10005, "Taryn", "Plano", new Date())));
		logger.info(" User id 10005 -> {}", dao.findById(10005));
	}
}
