package com.proj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.proj.models.*;

public class BuyerDBLogic {
	public boolean addBuyer(BuyerDetails userobj)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("insert into buyerdetails values(?,?,?,?,?)");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(1,userobj.getBuyname());
			pst.setString(2,userobj.getBuyemail());
			pst.setString(3,userobj.getBuyaddress());
			pst.setString(4,userobj.getBuymob());
			pst.setString(5,userobj.getBuypass());
			int i=pst.executeUpdate();
			System.out.println(i);
			if(i>0)
				f=true;
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
		finally {  // finally is used for clossing mechanism
		try {
			if(conobj != null)
				conobj.close();
			if(pst!=null)
				pst.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		}
		return f;
	}
	
	
	public BuyerDetails loginCheck(String useremail,String userpass)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		BuyerDetails userobj = null;
		try
			{
				conobj = dbconnect.getMySQLConnection();

				pst = conobj.prepareStatement("select * from buyerdetails where buyemail=? and buypass=?");
				pst.setString(1, useremail);
				pst.setString(2, userpass);

				rs = pst.executeQuery();
				if(rs.next())
					{
						userobj = new BuyerDetails();

						userobj.setBuyname(rs.getString(1));
						userobj.setBuyemail(rs.getString(2));
						userobj.setBuyaddress(rs.getString(3));
						userobj.setBuymob(rs.getString(4));
						userobj.setBuypass(rs.getString(5));;
					}
			}catch(SQLException e)
					{System.out.print(e.toString());}

		return userobj;
	}
	
	
	public boolean updateBuyer(BuyerDetails userobj)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("update buyerdetails set buyname=?,buyaddress=?,buymob=?,buypass=? where buyemail=?");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(5,userobj.getBuyemail());
			pst.setString(1,userobj.getBuyname());
			pst.setString(2,userobj.getBuyaddress());
			pst.setString(3,userobj.getBuymob());
			pst.setString(4,userobj.getBuypass());
			

			int i=pst.executeUpdate();
			System.out.println(i);
			if(i>0)
				f=true;
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
		finally {  // finally is used for clossing mechanism
		try {
			if(conobj != null)
				conobj.close();
			if(pst!=null)
				pst.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		}
		return f;
	}
	
	
	
	public List<BuyerDetails> fetchAllRecord()
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		BuyerDetails userobj = null;
		List<BuyerDetails> Buyerlist=new ArrayList<BuyerDetails>();

		try
			{
				conobj = dbconnect.getMySQLConnection();

				pst = conobj.prepareStatement("select * from buyerdetails");

				rs = pst.executeQuery();
				while(rs.next())
					{
						userobj = new BuyerDetails();

						userobj.setBuyname(rs.getString(1));
						userobj.setBuyemail(rs.getString(2));
						userobj.setBuyaddress(rs.getString(3));
						userobj.setBuymob(rs.getString(4));
						userobj.setBuypass(rs.getString(5));
						Buyerlist.add(userobj);
					}
			}catch(SQLException e)
					{System.out.print(e.toString());}

		return Buyerlist;
	}
	
	public boolean deleteBuyer(String buyemail)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("delete from buyerdetails where buyemail=?");  // number of questions marks
																	// Is equal to number of tables   
			
			pst.setString(1,buyemail);
			int i=pst.executeUpdate();
			System.out.println(i);
			if(i>0)
				f=true;
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
		finally {  // finally is used for clossing mechanism
		try {
			if(conobj != null)
				conobj.close();
			if(pst!=null)
				pst.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		}
		return f;
	}
	

}
