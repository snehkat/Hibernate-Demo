package com.orm.run;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.orm.model.Person;
import com.orm.utils.SessionProvider;

public class HibernateRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SessionFactory sf=SessionProvider.getSessionFactory();
	Session session=sf.openSession();
	
	//Query q=session.createQuery("from Person");
	
	Criteria q=session.createCriteria(Person.class);
	//Criterion c1=Restrictions.like("name", "A%");
	
	Order o= Order.asc("name");
	//q.add(c1);
	q.addOrder(o);
	List<Person> list=q.list();
	
	for(Person x: list)
		System.out.println(x.getName()+" "+x.getCity());
	
	
	/*Transaction t=session.beginTransaction();
		
	Person p=new Person(4,"Naresh","Bengaluru");
	Person p1=new Person(6,"Kavin","Pune");
	
	session.delete(p);
	session.saveOrUpdate(p1);
	t.commit();
	*/
	System.out.println("A New Reacord Added");
	
	}

}
