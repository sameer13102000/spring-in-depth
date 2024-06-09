package com.sameer.spring.basics.springDemo;

import com.sameer.spring.basics.springDemo.basic.binarySearchImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // To Initialize application context
@ComponentScan("com.sameer.spring.basics.springDemo") // if bean in the same package then the path can be ignored
public class SpringDemoBasicApplication {

	public static void main(String[] args) {
		//binarySearchImp bsi = new binarySearchImp(new quickSort()); // Bean
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoBasicApplication.class); // To Initialize application context
				//SpringApplication.run(SpringDemoBasicApplication.class, args);

		binarySearchImp bsi = applicationContext.getBean(binarySearchImp.class);
		binarySearchImp bsi1 = applicationContext.getBean(binarySearchImp.class);
		System.out.println(bsi);
		System.out.println(bsi1);
		int answer = bsi.binarySearchAlgo(new int[] {1,2,3,5,6,4}, 4);
		System.out.println();
		System.out.println(applicationContext.getDisplayName());
		System.out.println("The location of the Key element is " +answer);

	}

}
