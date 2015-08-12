package com.jinlei.spring.test.springSPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/jinlei/spring/test/springSPEL/beans.xml");
		
		Robot robot = (Robot) context.getBean("robot");
		robot.speak();
		
		((FileSystemXmlApplicationContext) context).close();
	}

}
