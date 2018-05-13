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
 * Servlet implementation class UpdateReimbursementServlet
 */
//@WebServlet("/viewallreimbursements")
public class UpdateReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ReimbursementService reimbServ = new ReimbursementService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateReimbursementServlet() {
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
			Reimbursement reimb = mapper.readValue(request.getInputStream(), Reimbursement.class);
			reimbServ.updateReimbursement(reimb);
			reimb = reimbServ.getReimbById(reimb.getReimbId());
			
			if(reimb != null) {
				HttpSession s = request.getSession();
				s.setAttribute("reimbursement", reimb);
			}
			
			PrintWriter out = response.getWriter();
			out.write(mapper.writeValueAsString(reimb));
		}
	}

}
