package com.thinkitive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.connection.AdminDBConnection;
import com.thinkitive.connection.ExamDbConnection;
import com.thinkitive.connection.StudentDBConnection;
import com.thinkitive.connection.TeacherDBConnection;
import com.thinkitive.model.Admin;
import com.thinkitive.model.Exam;
import com.thinkitive.model.Student;
import com.thinkitive.model.Teacher;


@RestController
public class AdminController {
	AdminDBConnection adbc = new AdminDBConnection();
	TeacherDBConnection tdbc = new TeacherDBConnection();
	StudentDBConnection sdbc = new StudentDBConnection();
	ExamDbConnection edb = new ExamDbConnection();

	@GetMapping(value = "/auth")
	public String insert(@RequestParam String adminUsername, @RequestParam String adminPassword) {
		if (adbc.authenticatDB(adminPassword, adminPassword)) {
			return "Success";
		} else {
			return "fail";
		}
	}

	@PostMapping(value = "/insertteach")
	public String insert(@RequestBody Teacher t) {
		if (adbc.addTeacher(t)) {
			return "teacher added";
		} else {
			return "insert fail";
		}

	}

	@PostMapping(value = "/insertstu")
	public String insert(@RequestBody Student s) {
		if (adbc.addStudent(s)) {
			return "student added";
		} else {
			return "insert fail";
		}

	}
	
	@PostMapping(value="/ansadmin")
	public int fetchResult(@RequestParam int examId) {
		return adbc.result(examId);
	}

}
