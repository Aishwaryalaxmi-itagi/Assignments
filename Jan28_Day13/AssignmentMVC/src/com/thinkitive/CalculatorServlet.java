package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		Double solution = 0.0;

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("operation");

		if (op == null) {
			solution = null;
			request.setAttribute("Solution", solution);
			RequestDispatcher rd = request.getRequestDispatcher("calculate.jsp");
			rd.forward(request, response);

		} else {
			try {
				Calculator c = new Calculator();

				if (op.equals("add"))
					solution = c.add(num1, num2);

				else if (op.equals("sub"))
					solution = c.sub(num1, num2);

				else if (op.equals("mul"))
					solution = c.mul(num1, num2);

				else if (op.equals("div"))
					solution = c.div(num1, num2);
				else if (op.equals("rem"))
					solution = c.rem(num1, num2);
				else
					solution = null;

			} catch (NumberFormatException e) {
				out.println("Number is null!!");
			}
			request.setAttribute("Solution", solution);
			RequestDispatcher rd = request.getRequestDispatcher("calculate.jsp");
			rd.forward(request, response);
		}

	}
}
