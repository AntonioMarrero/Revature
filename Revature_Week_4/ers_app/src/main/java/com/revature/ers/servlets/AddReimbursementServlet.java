package com.revature.ers.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.ers.pojo.Reimbursement;
import com.revature.ers.services.ReimbursementService;

/**
 * Servlet implementation class AddReimbursementServlet
 */
@WebServlet("/addreimbursement")
public class AddReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ReimbursementService reimbServ = new ReimbursementService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReimbursementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getInputStream() != null) {
			
			ObjectMapper mapper = new ObjectMapper();
			Reimbursement rmb = mapper.readValue(request.getInputStream(), Reimbursement.class);
			rmb = reimbServ.addReimbursement(rmb);
			
			if(rmb != null) {
				
				HttpSession s = request.getSession();
				s.setAttribute("reimbursement", rmb);
				
			}
			
			PrintWriter out = response.getWriter();
			out.write(mapper.writeValueAsString(rmb));
		}
	}

}
