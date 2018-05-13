package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CalculatorServlet() {
		
		super();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter pw = response.getWriter();
		//pw.write("Performed get request in Calculator servlet");
		//pw.write("<p>The calculator page is </p><br><a href=\"Calculator.html\">here</a>");
		
		RequestDispatcher rd = request.getRequestDispatcher("Calculator.html");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		String operation = request.getParameter("operation");
		String answer = "";
		
		try {
			
			int int1 = Integer.parseInt(n1);
			int int2 = Integer.parseInt(n2);
			
			switch(operation) {
			case "add":
				answer = ""+(int1+int2);
				break;
			case "substract":
				answer = ""+(int1-int2);
				break;
			case "multiply":
				answer = ""+(int1*int2);
				break;
			case "divide":
				answer = ""+(int1/int2);
				break;
			default:
				answer = "invalid operation";
			
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		PrintWriter pw = response.getWriter();
//		pw.write("<p>The anser is: "+answer);
//		pw.write("<br><a href=\"Calculator.html\">Calculate Again!</a>");
		
		request.setAttribute("answer", answer);
		
		RequestDispatcher rd = request.getRequestDispatcher("answer");
		rd.forward(request, response);
	}

}
