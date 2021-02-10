package com.thinkitive.connection;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thinkitive.model.Result;
import com.thinkitive.model.Student;

public class StudentDBConnection {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;

	public StudentDBConnection() {
		// TODO Auto-generated constructor stub

	}

	public Transaction config() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		return tx;
	}

	public boolean authenticatDB(String studentUsername, String studentPassword) {
		boolean flag = false;
		tx = config();
		String query = "select studentUsername, studentPassword from Student ";
		Query q = session.createQuery(query);
		List<Object[]> l = q.list();

		for (Object[] user : l) {
			String name = (String) user[0];
			String pass = (String) user[1];
			System.out.println(pass + " " + studentPassword);
			System.out.println(name + " " + studentUsername);
			if (pass.equals(studentPassword) && name.equals(studentUsername)) {
				flag = true;
			}
		}
		tx.commit();
		session.close();
		factory.close();

		return flag;
	}

	public List returnExam(int examID) {
		tx = config();
		String query = "select queNo,que, option1, option2, option3, option4 from Question where examID=" + examID;
		Query q = session.createQuery(query);
		List l = q.list();
		return l;
	}

	public void addAnswer(List<Result> l) {
		tx = config();
		for (int i = 0; i < l.size(); i++) {
			session.save(l.get(i));
		}
		tx.commit();
		session.close();
		factory.close();
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
