package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.*;
import com.proj.models.*;

/**
 * Servlet implementation class SellerUpdateDetails
 */
@WebServlet("/SellerUpdateDetails")
public class SellerUpdateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerUpdateDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		SellerDetails userobj=new SellerDetails();  // create object of model class
		userobj.setSellname(request.getParameter("sellname"));
		userobj.setSellemail(request.getParameter("sellemail"));
		userobj.setSelladdress(request.getParameter("selladdress"));
		userobj.setSellmob(request.getParameter("sellmob"));
		userobj.setSellpass(request.getParameter("sellpass"));
		SellerDBLogic dbobj=new SellerDBLogic();
		boolean b= dbobj.updateSeller(userobj);
		if(b)
		{
			System.out.println("record updated");
			request.setAttribute("recordinserted","SELLER DETAILS UPDATED");
			
			RequestDispatcher rd=request.getRequestDispatcher("SellerUpdateDetails.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("record not inserted");
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
