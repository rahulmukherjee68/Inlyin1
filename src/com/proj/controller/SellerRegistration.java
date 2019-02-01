package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.SellerDBLogic;
import com.proj.models.SellerDetails;


@WebServlet("/SellerRegistration")
public class SellerRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SellerRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		if(request.getParameter("sellerterms").equals("true")&&(request.getParameter("sellemail")!="")&&(request.getParameter("sellmob")!="")&&(request.getParameter("sellname")!=""))
{
			System.out.println(request.getParameter("sellname"));
		SellerDetails userobj=new SellerDetails();  // create object of model class
		userobj.setSellname(request.getParameter("sellname"));
		userobj.setSellemail(request.getParameter("sellemail"));
		userobj.setSelladdress(request.getParameter("selladdress"));
		userobj.setSellmob(request.getParameter("sellmob"));
		userobj.setSellpass(request.getParameter("sellpass"));
		SellerDBLogic dbobj=new SellerDBLogic();
		boolean b= dbobj.addSeller(userobj);
		if(b)
		{
			System.out.println("record inserted");
			
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response); 
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("SellerCannotRegister.jsp");
			rd.forward(request, response);
			System.out.println("record not inserted");
		}

	}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("SellerCannotRegister.jsp");
			rd.forward(request, response);
			System.out.println("record not inserted");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
