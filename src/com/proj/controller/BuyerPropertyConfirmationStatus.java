package com.proj.controller;

import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class BuyerPropertyConfirmationStatus
 */
@WebServlet("/BuyerPropertyConfirmationStatus")
public class BuyerPropertyConfirmationStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerPropertyConfirmationStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(false);
		 BuyerDetails buyerobj=new BuyerDetails();
		 buyerobj =(BuyerDetails)session.getAttribute("buyerinfo"); 
		 String buyemail=buyerobj.getBuyemail();
		 System.out.println(buyemail);
		 BuyerStatusDBLogic bsobj=new  BuyerStatusDBLogic();
		 List<BuyerStatusDetails> buyerstatuslist=bsobj.fetchBuyerSearchPropertyRecordStatus(buyemail);
		 List<BuyerStatusDetails> buyerstatuslist1 = new ArrayList<BuyerStatusDetails>();
		 if(buyerstatuslist.size()>0) {
		 for(BuyerStatusDetails ubobj:buyerstatuslist)
		 {
			 if(ubobj.getPropertystatus().equals("CONFIRMED BY SELLER"))
			 {
				 buyerstatuslist1.add(ubobj);
			 }
			 else
			 {
				 buyerstatuslist1.add(ubobj);
			 }
			 
		 }
		 request.setAttribute("buyerstatuslist",buyerstatuslist1);
		 RequestDispatcher rd=request.getRequestDispatcher("BuyerPropertyConfirmationStatus.jsp");
			rd.forward(request, response);
		 }
		 else
		 {
			 RequestDispatcher rd=request.getRequestDispatcher("BuyerNoPropertyStatus.jsp");
				rd.forward(request, response);
			 System.out.println("not done with viewing status");
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
