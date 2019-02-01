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

@WebServlet("/DeleteTableProperty")
public class DeleteTableProperty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeleteTableProperty() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String propertyid=request.getParameter("propertyid");
		PropertyDBLogic dbobj=new PropertyDBLogic();
		boolean k=dbobj.deleteProperty(propertyid);
		if(k) {
			RequestDispatcher rd=request.getRequestDispatcher("DeleteProperty");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
