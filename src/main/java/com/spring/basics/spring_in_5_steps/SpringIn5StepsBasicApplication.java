package com.spring.basics.spring_in_5_steps;

import com.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.basics.spring_in_5_steps.basic")
public class SpringIn5StepsBasicApplication {

	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans? => No need because all classes are in the same package

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//System.out.println(result);
		//Application Context

		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {124, 6}, 3);
		System.out.println(result);

	}

}
