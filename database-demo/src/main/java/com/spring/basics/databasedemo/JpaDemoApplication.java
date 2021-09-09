package com.spring.basics.databasedemo;

import com.spring.basics.databasedemo.entity.Person;
import com.spring.basics.databasedemo.jbdc.PersonJdbcDao;
import com.spring.basics.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(" User id 10001 -> {}", repository.findById(10001));
		logger.info(" Inserting 10005 -> {}", repository.insert(new Person(10005, "Taryn", "Dallas", new Date())));
		logger.info(" Updating 10003 -> {}", repository.update(new Person(10003, "Taryn", "Plano", new Date())));
		repository.deleteById(10001);
		logger.info(" Find all -> {}", repository.findAll());
	}
}
