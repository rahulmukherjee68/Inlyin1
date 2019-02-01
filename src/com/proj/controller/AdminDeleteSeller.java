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
 * Servlet implementation class AdminDeleteSeller
 */
@WebServlet("/AdminDeleteSeller")
public class AdminDeleteSeller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDeleteSeller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		String sellemail=request.getParameter("sellemail");
		SellerDBLogic dbobj=new SellerDBLogic();
		boolean k=dbobj.deleteSeller(sellemail);
		PropertyDBLogic dbobj1=new PropertyDBLogic();
		boolean f=dbobj1.deletePropertyByEmail(sellemail);
		System.out.println(f+"for property deletion of seller");
		if(k || f) {
			RequestDispatcher rd=request.getRequestDispatcher("ManageSeller");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("AdminAfterDeleteAllSeller.jsp");
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
