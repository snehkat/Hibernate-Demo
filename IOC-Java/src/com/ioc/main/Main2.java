package com.ioc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.system2.JavaConfig;
import com.ioc.system2.Project;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
		Project p=(Project)ac.getBean("erp");
		ac.getBean("erp");
		p.details();
		p=(Project)ac.getBean("mui");
		p.details();
		ac.close();

	}

}
