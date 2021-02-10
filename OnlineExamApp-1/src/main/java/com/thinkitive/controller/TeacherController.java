package com.thinkitive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.connection.ExamDbConnection;
import com.thinkitive.connection.TeacherDBConnection;
import com.thinkitive.model.Exam;
import com.thinkitive.model.Teacher;

@RestController
public class TeacherController {
	
	TeacherDBConnection tdbc=new TeacherDBConnection();
	ExamDbConnection edb = new ExamDbConnection();
	
	@GetMapping(value = "/authteach")
	public String authstu(@RequestParam String teacherUsername, @RequestParam String teacherPassword) {

		if (tdbc.authenticatDB(teacherUsername, teacherPassword)) {
			return "teacher login";
		} else {
			return "login fail";
		}

	}
	
	@PostMapping(value="/ansteach")
	public int fetchResult(@RequestParam int examId) {
		return tdbc.result(examId);
	}

}
