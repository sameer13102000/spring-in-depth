package com.sameer.spring.basics.springDemo;

import com.sameer.spring.basics.component.demo.componentDAO;
import com.sameer.spring.basics.springDemo.scope.PersonDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.sameer.spring.basics.component.demo")
public class SpringDemoComponentApplication {

	//private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoComponentApplication.class);
				//SpringApplication.run(SpringDemoComponentApplication.class, args);
		componentDAO componentDaoInstance = applicationContext.getBean(componentDAO.class);
//		LOGGER.info("This is {}", componentDaoInstance);
//		LOGGER.info("{}", componentDaoInstance.getJdbcConnection());
		System.out.println(componentDaoInstance);
		System.out.println(componentDaoInstance.getJdbcConnection());

	}

}
