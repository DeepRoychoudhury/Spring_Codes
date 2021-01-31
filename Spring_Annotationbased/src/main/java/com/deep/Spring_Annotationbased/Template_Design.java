package com.deep.Spring_Annotationbased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Template_Design implements Design_Pattern{

	public void design() {
		System.out.println("This is a Template design implementation");
	}

}
