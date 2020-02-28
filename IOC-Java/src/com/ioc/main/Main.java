package com.ioc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.system.Comapny;

public class Main {
 public static void main(String[] args) {
	 ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	 Comapny Comapny=(Comapny)ac.getBean("abc");
	 Comapny.establish("ABC private limited");
	 	Comapny=(Comapny)ac.getBean("xyz");
	 	Comapny.establish("xyz corporation");
	 
	
}

}
