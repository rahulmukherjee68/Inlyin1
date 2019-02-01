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


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println(request.getParameter("usertype"));
		if(request.getParameter("usertype").equals("SELLER"))
		{
			String userid = request.getParameter("useremail");
			String password = request.getParameter("userpass");
			if(userid.equals("admin@admin.com")&&password.equals("admin"))
			{
				RequestDispatcher rd = 
					    request.getRequestDispatcher("AdminAfterLogin.jsp");
				rd.forward(request,response);
			}
			else
			{
			SellerDBLogic dbobj = new SellerDBLogic();
			SellerDetails sellerobj = dbobj.loginCheck
					                     (userid, password);
			
			if(sellerobj != null)
			{
				System.out.println("WELCOME USER");
				
		    HttpSession session = request.getSession(true);
				session.setAttribute("sellerinfo", sellerobj);
			    response.sendRedirect("SellerAfterLoginPage.jsp");	
			}
			else
			{
				System.out.println("INVALID UID OR PASS");
				
				request.setAttribute("errormsg", "INVALID UID OR PASS");
				
				RequestDispatcher rd = 
					    request.getRequestDispatcher("Login.jsp");
				if(rd != null)
				  rd.forward(request, response);
				else
					System.out.println("Wrong File Name");
			}
			}
		}
		else
		{
			String userid = request.getParameter("useremail");
			String password = request.getParameter("userpass");	
			if(userid.equals("admin@admin.com")&&password.equals("admin"))
			{
				RequestDispatcher rd = 
					    request.getRequestDispatcher("AdminAfterLogin.jsp");
				rd.forward(request,response);
			}
			else
			{
			BuyerDBLogic dbobj = new BuyerDBLogic();
			BuyerDetails buyerobj = dbobj.loginCheck(userid, password);
			
			if(buyerobj != null)
			{
				System.out.println("WELCOME USER");
				
		    HttpSession session = request.getSession(true);
				session.setAttribute("buyerinfo", buyerobj);
			    response.sendRedirect("BuyerAfterLoginPage.jsp");	
			}
			else
			{
				System.out.println("INVALID UID OR PASS");
				
				request.setAttribute("errormsg", "INVALID UID OR PASS");
				
				RequestDispatcher rd = 
					    request.getRequestDispatcher("Login.jsp");
				if(rd != null)
				  rd.forward(request, response);
				else
					System.out.println("Wrong File Name");
			}
		}
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
