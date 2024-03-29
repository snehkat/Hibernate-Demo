package com.orm.run;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.orm.model.Department;
import com.orm.model.Emp;
import com.orm.utils.SessionProvider;

public class HibernateRun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf=SessionProvider.getSessionFactory();
		Session session=sf.openSession();
		
		
		Query q=session.createQuery("from Department");
		List<Department> list=q.list();
		for(Department d:list)
		{
			System.out.println(d.getName());
			System.out.println("-----------------------");
			for(Emp x:d.getEmployees())
				System.out.println(x.getName()+" "+x.getCity());
			
		}
	  /*  Transaction t= session.beginTransaction();
	    
	Department d=new Department(2,"Marketing");
	
Emp e1=new Emp(4,"arun","Chennai","Manager");
Emp e2=new Emp(5,"shyam","Pune","Clerk");
Emp e3=new Emp(6,"Tanu","Chennai","Superviser");

e1.setDept(d);e2.setDept(d);e3.setDept(d);//many to one

Set<Emp> set=new HashSet<Emp>();
set.add(e1);set.add(e2);set.add(e3);

d.setEmployees(set);

session.save(d);
t.commit();*/
	
	
	
	
	}

}
