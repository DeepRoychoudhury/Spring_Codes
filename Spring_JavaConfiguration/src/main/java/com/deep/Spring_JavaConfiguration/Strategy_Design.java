package com.deep.Spring_JavaConfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Strategy_Design implements Design_Pattern {

	public void design() {
		System.out.println("This is a Strategy design implementation");
	}

}
