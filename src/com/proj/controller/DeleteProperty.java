package com.proj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proj.dao.*;
import com.proj.models.*;

/**
 * Servlet implementation class DeleteProperty
 */
@WebServlet("/DeleteProperty")
public class DeleteProperty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProperty() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 HttpSession session = request.getSession(false);
		 SellerDetails sellerobj=new SellerDetails();
		 sellerobj =(SellerDetails)session.getAttribute("sellerinfo"); 
		PropertyDBLogic dbobj=new PropertyDBLogic();
		System.out.println(sellerobj.getSellemail());
		List<PropertyDetails> userlist=dbobj.fetchSearchPropertyRecord(sellerobj.getSellemail());
		if(userlist.size()>0) {
			System.out.println("user prsent");
			request.setAttribute("ulist",userlist);
			RequestDispatcher rd=request.getRequestDispatcher("SellerDeleteProperty.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("no property");
			RequestDispatcher rd=request.getRequestDispatcher("SellerNoProperty.jsp");
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
