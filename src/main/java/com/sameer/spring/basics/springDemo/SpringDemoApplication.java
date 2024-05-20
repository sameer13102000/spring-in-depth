package com.sameer.spring.basics.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {


	public static void main(String[] args) {
		binarySearchImp bsi = new binarySearchImp(new quickSort()); // can use any sorting algo in future just create an new instance of the new sort algo.
		int answer = bsi.binarySearchAlgo(new int[] {1,2,3,5,6,4}, 4);
		System.out.println(answer);
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
