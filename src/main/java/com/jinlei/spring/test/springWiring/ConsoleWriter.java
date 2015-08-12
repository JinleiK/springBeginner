package com.jinlei.spring.test.springWiring;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LoggerWriter {

	public void write(String text) {
		System.out.println(text);
	}
	
}
