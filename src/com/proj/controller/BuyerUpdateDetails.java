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
 * Servlet implementation class BuyerUpdateDetails
 */
@WebServlet("/BuyerUpdateDetails")
public class BuyerUpdateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BuyerUpdateDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		BuyerDetails userobj=new BuyerDetails();  // create object of model class
		userobj.setBuyname(request.getParameter("buyname"));
		userobj.setBuyemail(request.getParameter("buyemail"));
		userobj.setBuyaddress(request.getParameter("buyaddress"));
		userobj.setBuymob(request.getParameter("buymob"));
		userobj.setBuypass(request.getParameter("buypass"));
		BuyerDBLogic dbobj=new BuyerDBLogic();
		boolean b= dbobj.updateBuyer(userobj);
		if(b)
		{
			System.out.println("record updated");
			request.setAttribute("recordinserted","BUYER DETAILS UPDATED");
			
			RequestDispatcher rd=request.getRequestDispatcher("BuyerUpdateDetails.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("record not inserted");
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
