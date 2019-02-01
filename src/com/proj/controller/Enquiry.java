package com.proj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.PropertyDBLogic;
import com.proj.models.PropertyDetails;

/**
 * Servlet implementation class Enquiry
 */
@WebServlet("/Enquiry")
public class Enquiry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enquiry() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String propertystate=request.getParameter("propertystate");
		String propertytype=request.getParameter("propertytype");
		String propertyprice=request.getParameter("propertyprice");
		PropertyDBLogic dbobj=new PropertyDBLogic();
		List<PropertyDetails> userlist=dbobj.fetchBuyerSearchProperty(propertystate , propertytype , propertyprice);
		if(userlist.size()>0) {
			System.out.println("user prsent");
			request.setAttribute("ulist",userlist);
			RequestDispatcher rd=request.getRequestDispatcher("EnquiryResult.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("errormsg","SUCH TYPE OF PROPERTY IS NOT FOUND");
			RequestDispatcher rd = 
				    request.getRequestDispatcher("Enquiry.jsp");
			rd.forward(request,response);
			System.out.println("NO FOUND SUCH TYPE OF PROPERTY");
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
