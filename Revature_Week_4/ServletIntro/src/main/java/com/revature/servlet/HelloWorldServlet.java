package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.*;

public class HelloWorldServlet extends HttpServlet {
	
	
	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method was called");
		PrintWriter pw = res.getWriter();
		pw.println("Hello World");
	}
	

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method was called");

	}

	public void destroy() {
		System.out.println("Destroy called");
	}
}
