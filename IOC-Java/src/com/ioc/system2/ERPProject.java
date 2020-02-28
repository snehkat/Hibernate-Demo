package com.ioc.system2;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.ioc.events.MyEventPublisher;

public class ERPProject implements Project,InitializingBean,DisposableBean {
	@Autowired
	MyEventPublisher publish;
	
	public ERPProject()
	{
		
		System.out.println("ERP Project instantiated");
		System.out.println(hashCode());
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
     System.out.println("ERP Project started");
     publish.publish("ERP Publish");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception
	{
		
		System.out.println("After Properties set");
	}
	
	@PreDestroy
	public void doTask()
	{
		
		System.out.println("Destruction Task");
	}
	@Override
	public void destroy() throws Exception
	{
		
		System.out.println("Finalization Task");
	}

}
