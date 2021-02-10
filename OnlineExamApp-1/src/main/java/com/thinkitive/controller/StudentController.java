package com.thinkitive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.connection.StudentDBConnection;
import com.thinkitive.model.Result;
import com.thinkitive.model.Student;
import com.thinkitive.model.Teacher;

@RestController
public class StudentController {

	StudentDBConnection sdbc = new StudentDBConnection();

	@GetMapping(value = "/authstu")
	public String authstu(@RequestParam String studentUsername, @RequestParam String studentPassword) {

		if (sdbc.authenticatDB(studentUsername, studentPassword)) {
			return "student login";
		} else {
			return "login fail";
		}

	}
	
	@PostMapping(value="/giveexam")
	public List giveExam(@RequestParam String studentUsername, @RequestParam String studentPassword, @RequestParam int examID) {
		List l=new ArrayList<>();
		
		if(sdbc.authenticatDB(studentUsername, studentPassword)) {
			return sdbc.returnExam(examID);
		}
		else {
			return l;
		}
	}
	
	@PostMapping(value="/submitans")
	public void submitAnswers(@RequestBody List<Result> l) {
		sdbc.addAnswer(l);
	}
	
	@PostMapping(value="/ans")
	public int fetchResult(@RequestParam int examId) {
		return sdbc.result(examId);
	}
}
