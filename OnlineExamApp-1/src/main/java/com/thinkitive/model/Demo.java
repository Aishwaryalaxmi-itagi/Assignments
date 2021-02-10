package com.thinkitive.model;

import java.util.ArrayList;
import java.util.List;

import com.thinkitive.connection.ExamDbConnection;

public class Demo {
	public static void main(String[] args) {

		Question q1 = new Question(131, "what is java", "A. Technology", "B. coffee", "C. framework", "D. Game",
				"A. Technology");
		Question q2 = new Question(132, "what is an apple?", "A. fruit", "B. color", "C. game", "D. toy", "A. fruit");
		Question q3 = new Question(133, "what is phone", "A. game", "B. toy", "C. electronic device", "D. fruit",
				"C. electronic device");

		List<Question> l = new ArrayList();
		l.add(q1);
		l.add(q2);
		l.add(q3);

		//Exam ex1 = new Exam(13, l);

		ExamDbConnection edb = new ExamDbConnection();

		

		//edb.addExam(ex1);

	}
}
