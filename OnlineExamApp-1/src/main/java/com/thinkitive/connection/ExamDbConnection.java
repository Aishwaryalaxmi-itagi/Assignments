package com.thinkitive.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thinkitive.model.Exam;
import com.thinkitive.model.Question;

public class ExamDbConnection {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;

	public ExamDbConnection() {
		// TODO Auto-generated constructor stub
	}

	public void addExam(Exam e) {
		cfg = new Configuration();

		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		factory.close();
	}

	public void addQuestion(Question q) {
		cfg = new Configuration();

		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		session.save(q);

		tx.commit();
		session.close();
		factory.close();
	}
}
