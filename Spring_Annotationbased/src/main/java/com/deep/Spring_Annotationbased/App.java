package com.deep.Spring_Annotationbased;

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
        
        Design_Pattern dp = (Design_Pattern) ac.getBean(Design_Pattern.class);
        dp.design();
        
        Special_Method sm = (Special_Method) ac.getBean("observer");
        System.out.println(sm);
    }
}
