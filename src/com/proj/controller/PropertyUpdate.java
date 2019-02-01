package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.PropertyDBLogic;
import com.proj.models.PropertyDetails;

/**
 * Servlet implementation class PropertyUpdate
 */
@WebServlet("/PropertyUpdate")
public class PropertyUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PropertyUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
		boolean b= dbobj.updateProperty(userobj);
		if(b)
		{
			System.out.println("record updated");
			
			request.setAttribute("recordupdated", "PROPERTY UPDATED SUCCESSFULLLY");
			RequestDispatcher rd=request.getRequestDispatcher("SellerUpdateProperty.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("record not updated ");
			request.setAttribute("recordnotupdated", "PROPERTY UPDATED UNSUCCESSFULLLY INVALID PROPERTY ID");
			RequestDispatcher rd=request.getRequestDispatcher("SellerUpdateProperty.jsp");
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
