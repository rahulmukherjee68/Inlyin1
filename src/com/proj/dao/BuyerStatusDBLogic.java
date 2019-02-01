package com.proj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.proj.models.*;

public class BuyerStatusDBLogic {

		public boolean addBuyerStatus(String buyname,String buyemail,String propertyid,String propertystatus )
		{
			Connection conobj=null;
			PreparedStatement pst=null;
			boolean f= false;
			try
			{
				conobj=dbconnect.getMySQLConnection();
				pst=conobj.prepareStatement("insert into buyerstatusdetails values(?,?,?,?)");  // number of questions marks
																		// Is equal to number of tables   
				pst.setString(1,buyname);
				pst.setString(2,buyemail);
				pst.setString(3,propertyid);
				pst.setString(4,propertystatus);
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
		
		
		public boolean updateBuyerStatus(String propertyid)
		{
			Connection conobj=null;
			PreparedStatement pst=null;
			boolean f= false;
			try
			{
				conobj=dbconnect.getMySQLConnection();
				pst=conobj.prepareStatement("update buyerstatusdetails set propertystatus=? where propertyid=?");  // number of questions marks
																		// Is equal to number of tables   
				pst.setString(1,"CONFIRMED BY SELLER");
				pst.setString(2,propertyid);
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
		
		
		
		public List<BuyerStatusDetails> fetchBuyerSearchPropertyRecordStatus(String buyemail)
		{
			Connection conobj=null;
			PreparedStatement pst=null;
			boolean f= false;
			ResultSet rs=null;
			List<BuyerStatusDetails> Propertylist=new ArrayList<BuyerStatusDetails>();
			try
			{
				conobj=dbconnect.getMySQLConnection();
				pst=conobj.prepareStatement("select * from buyerstatusdetails where buyemail=?"); 
				// number of questions marks
				pst.setString(1,buyemail);
				rs=pst.executeQuery();
				while(rs.next()) {
					BuyerStatusDetails userobj=new BuyerStatusDetails();
					userobj.setBuyname(rs.getString(1));
					userobj.setBuyemail(rs.getString(2));
					userobj.setPropertyid(rs.getString(3));
					userobj.setPropertystatus(rs.getString(4));
					Propertylist.add(userobj);
				}
				
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
			System.out.println(Propertylist.size());
			return Propertylist;

	}
}
