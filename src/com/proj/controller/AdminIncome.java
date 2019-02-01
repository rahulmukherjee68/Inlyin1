package com.proj.controller;

import java.io.IOException;
import java.util.List;

import com.proj.models.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.proj.dao.*;
/**
 * Servlet implementation class AdminIncome
 */
@WebServlet("/AdminIncome")
public class AdminIncome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminIncome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PropertyDBLogic dbobj=new PropertyDBLogic();
		List<PropertyDetails> userlist=dbobj.fetchAllRecordOfSolds();
		if(userlist.size()>0) {
			
			System.out.println("property present");
			request.setAttribute("ulist",userlist);
			RequestDispatcher rd=request.getRequestDispatcher("AdminIncome.jsp");
			rd.forward(request, response);
	}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("AdminIncome.jsp");
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
