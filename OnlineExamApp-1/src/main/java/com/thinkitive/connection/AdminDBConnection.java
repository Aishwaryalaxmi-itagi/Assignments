package com.thinkitive.connection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.thinkitive.model.Admin;
import com.thinkitive.model.Exam;
import com.thinkitive.model.Student;
import com.thinkitive.model.Teacher;

public class AdminDBConnection {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;

	public AdminDBConnection() {
		// TODO Auto-generated constructor stub

	}

	public Transaction config() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		return tx;
	}
	public boolean authenticatDB(String adminUsername, String adminPassword) {
		boolean flag = false;
		
		tx = config();
		String query = "select adminUsername, adminPassword from Admin ";
		Query q = session.createQuery(query);
		List<Object[]> l = q.list();

		for (Object[] user : l) {
			String name = (String) user[0];
			String pass = (String) user[1];
			System.out.println(pass + " " + adminPassword);
			System.out.println(name + " " + adminUsername);
			if (pass.equals(adminPassword) && name.equals("admin")) {
				flag = true;
			}
		}
		tx.commit();
		session.close();
		factory.close();

		return flag;
	}

	public boolean addTeacher(Teacher t) {
		boolean flag = true;
		
		tx = config();
		session.save(t);

		tx.commit();
		session.close();
		factory.close();

		return flag;
	}

	public boolean addStudent(Student s) {
		boolean flag = true;
		tx=config();
		session.save(s);

		tx.commit();
		session.close();
		factory.close();

		return flag;
	}
	
	public int result(int examId) {
		tx = config();
		int count = 0;
		String q1 = "select queNo, answer from Question where examID=" + examId;
		Query query1 = session.createQuery(q1);
		List<Object[]> l1 = query1.list();
		String q2 = "from Result";
		Query query2 = session.createQuery(q2);
		List<Object[]> l2 = query2.list();
		System.out.println(l1);
		System.out.println(l2);
		for (Object[] ans1 : l1) {
			for (Object[] ans2 : l2) {
				String a = (String) ans1[0];
				String b = (String) ans2[0];
				
				if (a.equals(b)) {
					count++;
				}
			}
		}
		return count;
	}

}
