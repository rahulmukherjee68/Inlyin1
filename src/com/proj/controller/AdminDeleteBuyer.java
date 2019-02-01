package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.*;

/**
 * Servlet implementation class AdminDeleteBuyer
 */
@WebServlet("/AdminDeleteBuyer")
public class AdminDeleteBuyer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDeleteBuyer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String buyemail=request.getParameter("buyemail");
		BuyerDBLogic dbobj=new BuyerDBLogic();
		boolean k=dbobj.deleteBuyer(buyemail);
		if(k) {
			RequestDispatcher rd=request.getRequestDispatcher("ManageBuyer");
			rd.forward(request, response);
		}
		else
		{

			RequestDispatcher rd=request.getRequestDispatcher("AdminAfterDeleteAllBuyer.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
