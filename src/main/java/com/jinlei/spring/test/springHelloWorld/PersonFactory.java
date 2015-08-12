package com.jinlei.spring.test.springHelloWorld;

public class PersonFactory {
	public Person createPerson(int id, String name) {
		System.out.println("Create using factory class");
		return new Person(id, name);
	}
}
