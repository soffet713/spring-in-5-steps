package com.spring.basics.spring_in_5_steps;

import com.spring.basics.spring_in_5_steps.properties.SomeExternalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.basics.spring_in_5_steps.properties")
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext =
					new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service);
		}

	}

}
