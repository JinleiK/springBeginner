package com.jinlei.spring.test.springSPEL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private String id = "0";
	private String speech = "hello";
	
	public void speak() {
		System.out.println(id + ": " + speech);
	}

	@Autowired
	public void setId(@Value("#{randomText.text?.length()}") String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("#{new java.util.Date().toString()}") String speech) {
		this.speech = speech;
	}
	
	
}
