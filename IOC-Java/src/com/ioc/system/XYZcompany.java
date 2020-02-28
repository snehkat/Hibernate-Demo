package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

public class XYZcompany implements Comapny {
	private BusinessOperation branch;
	@Autowired
	private Process accounting;
	@Autowired
	private Process production;
	
	public XYZcompany(BusinessOperation branch) {
		super();
		this.branch = branch;
	}
	@Override
	public void establish(String name)
	{
	System.out.println("Registerd and started"+name+" Company");
	branch.perform("Bengaluru");
	accounting.process("Second Qaurter");
	production.process("Nuts and Bolts");
	}

}
