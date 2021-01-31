package com.deep.Spring_JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
       
       Design_Pattern dp = (Design_Pattern) ac.getBean(Design_Pattern.class);
       dp.design();
    }
}
