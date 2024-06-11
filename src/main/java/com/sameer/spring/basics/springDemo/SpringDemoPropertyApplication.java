package com.sameer.spring.basics.springDemo;

import com.sameer.spring.basics.property.SomeExternalURL;
import com.sameer.spring.basics.springDemo.basic.binarySearchImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // To Initialize application context
@ComponentScan("com.sameer.spring.basics.property") // if bean in the same package then the path can be ignored
@PropertySource("classpath:app.properties")
public class SpringDemoPropertyApplication {

	public static void main(String[] args) {


		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoPropertyApplication.class)){
			// To Initialize application context
			//SpringApplication.run(SpringDemoBasicApplication.class, args);

			SomeExternalURL url = applicationContext.getBean(SomeExternalURL.class);

			System.out.println(url);

			System.out.println(applicationContext.getDisplayName());

			System.out.println(url.getURL());
		}

	}

}
