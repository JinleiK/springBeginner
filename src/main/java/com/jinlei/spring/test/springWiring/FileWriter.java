package com.jinlei.spring.test.springWiring;

import org.springframework.stereotype.Component;

@Component("fileWriter")
public class FileWriter implements LoggerWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
