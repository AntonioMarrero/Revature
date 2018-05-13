package com.revature.ers.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.ers.pojo.User;
import com.revature.ers.services.LoginService;

/**
 * Servlet implementation class AuthenticationServlet
 */
@WebServlet("/login")
public class AuthenticationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static LoginService loginService = new LoginService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getInputStream() != null) {
			
			ObjectMapper mapper = new ObjectMapper();
			
			
			User user = mapper.readValue(request.getInputStream(), User.class);
			
			user = loginService.login(user);
			
			if(user != null) {
				
				user.setPw("");
				
				HttpSession session = request.getSession();
				
				session.setAttribute("user", user);
				
			}
			
			PrintWriter out = response.getWriter();
			
			out.write(mapper.writeValueAsString(user));
			
		}
	}

}
