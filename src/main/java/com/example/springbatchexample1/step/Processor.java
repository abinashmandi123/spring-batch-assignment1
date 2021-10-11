package com.example.springbatchexample1.step;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String>{

	@Override
	public String process(String data) throws Exception {
		System.out.println("This is processor");
		System.out.println("This is an error message");
		return data.toUpperCase();
	}
}
