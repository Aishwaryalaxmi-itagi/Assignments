package com.thinkitive;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class MyDbConnection {

	Employee e;
	Configuration cfg;
	SessionFactory factory;

	Session session;
	Transaction tx;

	public MyDbConnection() {

		cfg = new Configuration();

		factory = cfg.configure().buildSessionFactory();

	}

	public void insertEmployee(int empid, String ename, int salary) {
		e = new Employee(empid, ename, salary);

		session = factory.openSession(); // CONNECTION OPEN
		tx = session.beginTransaction();
		session.save(e);

		tx.commit();
		session.close();
		// factory.close();

	}

	public void deleteEmployee(int empid, String ename, int salary) {
		e = new Employee(empid, ename, salary);

		session = factory.openSession(); // CONNECTION OPEN
		tx = session.beginTransaction();

		session.delete(e);
		tx.commit();
		session.close();

	}

	public void updateEmployee(int empid, String ename, int salary) {
		e = new Employee(empid, ename, salary);

		session=factory.openSession();
		tx = session.beginTransaction();

		session.update(e);

		tx.commit();
		session.close();

	}

	public void displayEmployee() {
		session = factory.openSession(); // CONNECTION OPEN
		tx = session.beginTransaction();

		Query q = session.createQuery("From Employee");
		List l = q.list();
		System.out.println(l);
		// session.save(e);

	}

}
