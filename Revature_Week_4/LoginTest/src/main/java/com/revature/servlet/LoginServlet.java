package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		//pw.write("Performed get request in Calculator servlet");
		//pw.write("<p>The calculator page is </p><br><a href=\"Calculator.html\">here</a>");
		
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		try {
			if(un != null & pwd != null) {
				System.out.println(un + pwd);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter pw = response.getWriter();
		pw.write("<p>Your username and password are: " + un + " " + pwd );
		pw.write("<br><a href=\"Login.html\">Login Again!</a>");
		
	}

}
