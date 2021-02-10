package com.thinkitive.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.connection.AdminDBConnection;
import com.thinkitive.connection.ExamDbConnection;
import com.thinkitive.connection.TeacherDBConnection;
import com.thinkitive.model.Exam;
@RestController
public class ExamController {
	ExamDbConnection edb = new ExamDbConnection();
	AdminDBConnection adbc=new AdminDBConnection();
	TeacherDBConnection tdbc = new TeacherDBConnection();
	
	@PostMapping(value="/addexam")
	public String insertExam(@RequestParam String username, @RequestParam String pass,  @RequestBody Exam e) {
		if((adbc.authenticatDB(username, pass)) || (tdbc.authenticatDB(username, pass)))
		{
			edb.addExam(e);
			return "Exam added";
		}
		else {
			return "Invalid credntials";
		}
		
		
	}
	
}
