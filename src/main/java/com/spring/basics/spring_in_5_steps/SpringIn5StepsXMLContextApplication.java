package com.spring.basics.spring_in_5_steps;

import com.spring.basics.spring_in_5_steps.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.spring.basics.spring_in_5_steps.xml")
public class SpringIn5StepsXMLContextApplication {

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("testContext.xml")) {
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());
		}

	}

}
