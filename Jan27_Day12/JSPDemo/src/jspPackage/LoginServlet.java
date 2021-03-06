package jspPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		String username=request.getParameter("txtusername");
		String pass=request.getParameter("txtpassword");
		if (username.equals("admin") && pass.equals("admin")) {
			RequestDispatcher d=request.getRequestDispatcher("login.jsp");
			request.setAttribute("message", "<p class='btn-success'>SUCCESSFUL LOGIN<p/>");
			d.forward(request, response);
		} else {
			RequestDispatcher d=request.getRequestDispatcher("login.jsp");
			request.setAttribute("message", "<p class='btn-danger'>INVALID CREDENTIALS<p/>");
			d.forward(request, response);
		}
	}

}
