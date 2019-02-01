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
 * Servlet implementation class UpdatePropertyStatus
 */
@WebServlet("/UpdatePropertyStatus")
public class UpdatePropertyStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePropertyStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PropertyDBLogic dbobj=new PropertyDBLogic();
		boolean k=dbobj.updatePropertyStatus(request.getParameter("propertyid"));
		BuyerStatusDBLogic bsobj=new BuyerStatusDBLogic();
		boolean f=bsobj.updateBuyerStatus(request.getParameter("propertyid"));
		if(k && f)
		{
			System.out.println("status updated for both buyer status and seller status");
			RequestDispatcher rd=request.getRequestDispatcher("SellerPropertyStatus");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("not updated");
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
