package com.revature.ers.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.ers.pojo.Reimbursement;
import com.revature.ers.pojo.User;
import com.revature.ers.services.ReimbursementService;

/**
 * Servlet implementation class AllReimbursementServlet
 */
@WebServlet("/viewallreimbursements")
public class AllReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static ReimbursementService reimbService = new ReimbursementService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllReimbursementServlet() {
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
//			int id = mapper.readValue(request.getInputStream(), Integer.class);
		
//			System.out.println(id);
			ArrayList<Reimbursement> reim = reimbService.getAllReimbursements();
			
			ObjectMapper mapper2 = new ObjectMapper();
			String temps = "";
			PrintWriter pw = response.getWriter();
            temps = mapper2.writeValueAsString(reim);
            pw.write(temps);
		}
	}
}
