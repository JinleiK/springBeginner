package com.jinlei.spring.test.springWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jinlei/spring/test/springWiring/beans.xml");
		
		Logger logger = (Logger) context.getBean("logger");
		
		logger.writeConsole("hello console");
		logger.writeFile("hello file");
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
