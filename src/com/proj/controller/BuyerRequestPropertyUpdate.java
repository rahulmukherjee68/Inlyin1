package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proj.dao.*;
import com.proj.models.*;


@WebServlet("/BuyerRequestPropertyUpdate")
public class BuyerRequestPropertyUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BuyerRequestPropertyUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String propertyid=request.getParameter("propertyid");
		String propertystatus="REQUEST SEND";
		HttpSession session = request.getSession(false);
		 BuyerDetails buyerobj=new BuyerDetails();
		 buyerobj =(BuyerDetails)session.getAttribute("buyerinfo"); 
		 String buyname=buyerobj.getBuyname();
		 String buyemail=buyerobj.getBuyemail();
		PropertyDBLogic dbobj=new PropertyDBLogic();
		boolean k=dbobj.updateBuyerPropertyRequestStatus(propertyid);
		BuyerStatusDBLogic bsobj=new BuyerStatusDBLogic();
		boolean f=bsobj.addBuyerStatus(buyname, buyemail, propertyid, propertystatus);  // for inserting status of property
		if(k) {
			request.setAttribute("PROPERTYID",propertyid);
			RequestDispatcher rd=request.getRequestDispatcher("BuyerThanksForRequest.jsp");
			rd.forward(request, response);
			System.out.println("status updated to request");
			
		}
		else
		{
			System.out.println("not done with status update");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
