package com.jinlei.spring.test.springHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
//		Person person1 = (Person) context.getBean("person");
//		Address address = (Address) context.getBean("address2");
//		
//		person1.setTaxId(111);
//		
//		System.out.println(person1);
//		System.out.println(address);
//		
//		FruitBasket basket = (FruitBasket) context.getBean("basket");
//		System.out.println(basket);
		
		Jungle jungle = (Jungle) context.getBean("jungle");
		System.out.println(jungle);
		
		((FileSystemXmlApplicationContext) context).close();
	}

}
