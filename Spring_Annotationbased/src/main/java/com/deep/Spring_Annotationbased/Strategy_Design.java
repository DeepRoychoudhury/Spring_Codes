package com.deep.Spring_Annotationbased;

import org.springframework.stereotype.Component;

@Component
public class Strategy_Design implements Design_Pattern{

	public void design() {
		System.out.println("This is a Strategy design implementation");
	}

}
