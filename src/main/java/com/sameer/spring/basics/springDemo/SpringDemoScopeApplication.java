package com.sameer.spring.basics.springDemo;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.sameer.spring.basics.springDemo.scope.PersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.sameer.spring.basics.springDemo")
public class SpringDemoScopeApplication {

	//private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

	public static void main(String[] args) {

		// using try with resource to close the applicationContext instance. (GOOD PRACTISE)

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoScopeApplication.class)){
			//SpringApplication.run(SpringDemoScopeApplication.class, args);
			PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
//		LOGGER.info("This is {}", personDao);
//		LOGGER.info("{}", personDao.getJdbcConnection());
//		LOGGER.info("That is {}", personDao2);
//		LOGGER.info("{}", personDao.getJdbcConnection());
			System.out.println(personDao); ;
			System.out.println(personDao.getJdbcConnection());
			System.out.println(personDao2);
			System.out.println(personDao2.getClass());
		};

	}

}
