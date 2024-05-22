package com.sameer.spring.basics.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		//binarySearchImp bsi = new binarySearchImp(new quickSort()); // Bean
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		binarySearchImp bsi = applicationContext.getBean(binarySearchImp.class);
		int answer = bsi.binarySearchAlgo(new int[] {1,2,3,5,6,4}, 4);
		System.out.println();
		System.out.println(applicationContext.getDisplayName());
		System.out.println("The location of the Key element is " +answer);

	}

}
