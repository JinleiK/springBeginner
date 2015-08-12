package com.jinlei.spring.test.springHelloWorld;

import java.util.HashMap;
import java.util.Map;

public class Jungle {
	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String, Animal> animals = new HashMap<String, Animal>();
	
	public Map<String, String> getFoods() {
		return foods;
	}
	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}
	public Map<String, Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String> entry : foods.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		sb.append("\n");
		
		for(Map.Entry<String, Animal> entry : animals.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		sb.append("\n");
		return sb.toString();
	}
	
	
}
