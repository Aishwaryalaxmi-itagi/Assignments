package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	int count = 0;
	private static final long serialVersionUID = 1L;

	public HelloWorld() {
		super();

	}

	@Override
	public void init() throws ServletException {

		System.out.println("init......");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		count++;
		PrintWriter out = response.getWriter();
		out.println("GET Visitors count:" + count);
		String user = request.getParameter("txtusername");
		String pass = request.getParameter("txtpassword");

		out.println(user + " " + pass);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		count++;
		PrintWriter out = response.getWriter();
		// out.println("POST Visitors count:"+count);
		String user = request.getParameter("txtnumber");

		int num = Integer.parseInt(user);
		Factorial f = new Factorial();

		out.println("Factorial of " + num + " is :" + f.fact(num));
	}

	@Override
	public void destroy() {

		super.destroy();
		System.out.println("destroy....");
	}

}
