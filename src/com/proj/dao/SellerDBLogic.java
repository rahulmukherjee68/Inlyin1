package com.proj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.proj.models.*;

public class SellerDBLogic {

	
	public boolean addSeller(SellerDetails userobj)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("insert into sellerdetails values(?,?,?,?,?)");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(1,userobj.getSellname());
			pst.setString(2,userobj.getSellemail());
			pst.setString(3,userobj.getSelladdress());
			pst.setString(4,userobj.getSellmob());
			pst.setString(5,userobj.getSellpass());
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
	
	public SellerDetails loginCheck(String useremail,String userpass)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		SellerDetails userobj = null;
		try
			{
				conobj = dbconnect.getMySQLConnection();

				pst = conobj.prepareStatement("select * from sellerdetails where sellemail=? and sellpass=?");
				pst.setString(1, useremail);
				pst.setString(2, userpass);

				rs = pst.executeQuery();
				if(rs.next())
					{
						userobj = new SellerDetails();

						userobj.setSellname(rs.getString(1));
						userobj.setSellemail(rs.getString(2));
						userobj.setSelladdress(rs.getString(3));
						userobj.setSellmob(rs.getString(4));
						userobj.setSellpass(rs.getString(5));;
					}
			}catch(SQLException e)
					{System.out.print(e.toString());}

		return userobj;
	}
	
	
	public boolean updateSeller(SellerDetails userobj)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("update sellerdetails set sellname=?,selladdress=?,sellmob=?,sellpass=? where sellemail=?");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(5,userobj.getSellemail());
			pst.setString(1,userobj.getSellname());
			pst.setString(2,userobj.getSelladdress());
			pst.setString(3,userobj.getSellmob());
			pst.setString(4,userobj.getSellpass());
			

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
	
	
	public List<SellerDetails> fetchAllRecord()
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		SellerDetails userobj = null;
		List<SellerDetails> Sellerlist=new ArrayList<SellerDetails>();

		try
			{
				conobj = dbconnect.getMySQLConnection();

				pst = conobj.prepareStatement("select * from sellerdetails");

				rs = pst.executeQuery();
				while(rs.next())
					{
						userobj = new SellerDetails();

						userobj.setSellname(rs.getString(1));
						userobj.setSellemail(rs.getString(2));
						userobj.setSelladdress(rs.getString(3));
						userobj.setSellmob(rs.getString(4));
						userobj.setSellpass(rs.getString(5));
						Sellerlist.add(userobj);
					}
			}catch(SQLException e)
					{System.out.print(e.toString());}

		return Sellerlist;
	}
	
	
	public boolean deleteSeller(String sellemail)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("delete from sellerdetails where sellemail=?");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(1,sellemail);
	
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
