package com.proj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.*;
import com.proj.models.*;

/**
 * Servlet implementation class ManageSeller
 */
@WebServlet("/ManageSeller")
public class ManageSeller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageSeller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		SellerDBLogic dbobj=new SellerDBLogic();
		List<SellerDetails> sellerlist=dbobj.fetchAllRecord();
		
		if(sellerlist.size()>0) {
			System.out.println("Seller present");
			request.setAttribute("ulist",sellerlist);
			RequestDispatcher rd=request.getRequestDispatcher("ManageSeller.jsp");
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
