package com.deep.Spring_Xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        
        Design_Pattern obj = (Design_Pattern) ac.getBean("design_pattern");
        obj.design();
    }
}
