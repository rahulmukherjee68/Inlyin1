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


@WebServlet("/PropertyRegistration")
public class PropertyRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PropertyRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PropertyDetails userobj=new PropertyDetails();  // create object of model class
		userobj.setPropertyid(request.getParameter("propertyid"));
		userobj.setSelleremail(request.getParameter("selleremail"));
		userobj.setPropertystate(request.getParameter("propertystate"));
		userobj.setPropertytype(request.getParameter("propertytype"));
		userobj.setPropertyprice(request.getParameter("propertyprice"));
		userobj.setPropertyaddress(request.getParameter("propertyaddress"));
		PropertyDBLogic dbobj=new PropertyDBLogic();
		boolean b= dbobj.addProperty(userobj);
		if(b)
		{
			System.out.println("property inserted");
			
			request.setAttribute("recordinserted", "PROPERTY INSERTED");
			RequestDispatcher rd=request.getRequestDispatcher("SellerAddPropertyRegistration.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("property not inserted");
		}

		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
