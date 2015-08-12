package com.jinlei.spring.test.springDB;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {
	private String[] texts = {
			"yoooooooo",
			"boom shaka laka",
			"let it go~",
			null
	};
	
	public String getText() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}
