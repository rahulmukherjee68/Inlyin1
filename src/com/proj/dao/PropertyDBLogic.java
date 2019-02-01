package com.proj.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.proj.models.*;
public class PropertyDBLogic {
	
	public boolean addProperty(PropertyDetails userobj)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("insert into propertydetails values(?,?,?,?,?,?,?)");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(1,userobj.getPropertyid());
			pst.setString(2,userobj.getSelleremail());
			pst.setString(3,userobj.getPropertystate());
			pst.setString(4,userobj.getPropertytype());
			pst.setString(5,userobj.getPropertyprice());
			pst.setString(6,userobj.getPropertyaddress());
			pst.setString(7,"NOT SOLD");

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
	
	
	public boolean updateProperty(PropertyDetails userobj)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("update propertydetails set selleremail=?, propertystate=?,propertytype=?,propertyprice=?,propertyaddress=? where propertyid=?");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(6,userobj.getPropertyid());
			pst.setString(1,userobj.getSelleremail());
			pst.setString(2,userobj.getPropertystate());
			pst.setString(3,userobj.getPropertytype());
			pst.setString(4,userobj.getPropertyprice());
			pst.setString(5,userobj.getPropertyaddress());

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
	
	
	public List<PropertyDetails> fetchSearchPropertyRecord(String useremail)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		ResultSet rs=null;
		List<PropertyDetails> Propertylist=new ArrayList<PropertyDetails>();
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("select * from PropertyDetails where selleremail=?"); 
			// number of questions marks
			pst.setString(1,useremail);
			rs=pst.executeQuery();
			while(rs.next()) {
				PropertyDetails userobj=new PropertyDetails();
				userobj.setPropertyid(rs.getString(1));
				userobj.setSelleremail(rs.getString(2));
				userobj.setPropertystate(rs.getString(3));
				userobj.setPropertytype(rs.getString(4));
				userobj.setPropertyprice(rs.getString(5));
				userobj.setPropertyaddress(rs.getString(6));
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
	
	public boolean deleteProperty(String Propertyid)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("delete from propertydetails where propertyid=?");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(1,Propertyid);


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
	public List<PropertyDetails> fetchSearchPropertyRecordStatus(String useremail)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		ResultSet rs=null;
		List<PropertyDetails> Propertylist=new ArrayList<PropertyDetails>();
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("select * from PropertyDetails where selleremail=?"); 
			// number of questions marks
			pst.setString(1,useremail);
			rs=pst.executeQuery();
			while(rs.next()) {
				PropertyDetails userobj=new PropertyDetails();
				userobj.setPropertyid(rs.getString(1));
				userobj.setSelleremail(rs.getString(2));
				userobj.setPropertystate(rs.getString(3));
				userobj.setPropertytype(rs.getString(4));
				userobj.setPropertyprice(rs.getString(5));
				userobj.setPropertyaddress(rs.getString(6));
				userobj.setPropertystatus(rs.getString(7));

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
	
	
	public boolean updatePropertyStatus(String propertyid)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("update propertydetails set propertystatus=? where propertyid=?");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(1,"SOLD");
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
	
	
	
	public List<PropertyDetails> fetchBuyerSearchProperty(String propertystate,String propertytype,String propertyprice)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		ResultSet rs=null;
		List<PropertyDetails> Propertylist=new ArrayList<PropertyDetails>();
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("select * from PropertyDetails where propertystate=? and propertytype=? and propertyprice<=? and propertystatus=?"); 
			// number of questions marks
			pst.setString(1,propertystate);
			pst.setString(2,propertytype);
			pst.setString(3,propertyprice);
			pst.setString(4,"NOT SOLD");
			rs=pst.executeQuery();
			while(rs.next()) {
				PropertyDetails userobj=new PropertyDetails();
				userobj.setPropertyid(rs.getString(1));
				userobj.setSelleremail(rs.getString(2));
				userobj.setPropertystate(rs.getString(3));
				userobj.setPropertytype(rs.getString(4));
				userobj.setPropertyprice(rs.getString(5));
				userobj.setPropertyaddress(rs.getString(6));
				userobj.setPropertystatus(rs.getString(7));
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
	
	public boolean updateBuyerPropertyRequestStatus(String propertyid)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("update propertydetails set propertystatus=? where propertyid=?");  // number of questions marks
																	// Is equal to number of tables   
			pst.setString(1,"REQUEST");
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
	
	
	
	public List<PropertyDetails> fetchAllRecord()
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		ResultSet rs=null;
		List<PropertyDetails> Propertylist=new ArrayList<PropertyDetails>();
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("select * from PropertyDetails "); 
			// number of questions marks
			rs=pst.executeQuery();
			while(rs.next()) {
				PropertyDetails userobj=new PropertyDetails();
				userobj.setPropertyid(rs.getString(1));
				userobj.setSelleremail(rs.getString(2));
				userobj.setPropertystate(rs.getString(3));
				userobj.setPropertytype(rs.getString(4));
				userobj.setPropertyprice(rs.getString(5));
				userobj.setPropertyaddress(rs.getString(6));
				userobj.setPropertystatus(rs.getString(7));

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
	
	
	public boolean deletePropertyByEmail(String sellemail)
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("delete from propertydetails where selleremail=?");  // number of questions marks
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
	
	
	
	public List<PropertyDetails> fetchAllRecordOfRequests()
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		ResultSet rs=null;
		List<PropertyDetails> Propertylist=new ArrayList<PropertyDetails>();
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("select * from PropertyDetails where propertystatus=?");
			pst.setString(1,"REQUEST");
			// number of questions marks
			rs=pst.executeQuery();
			while(rs.next()) {
				PropertyDetails userobj=new PropertyDetails();
				userobj.setPropertyid(rs.getString(1));
				userobj.setSelleremail(rs.getString(2));
				userobj.setPropertystate(rs.getString(3));
				userobj.setPropertytype(rs.getString(4));
				userobj.setPropertyprice(rs.getString(5));
				userobj.setPropertyaddress(rs.getString(6));
				userobj.setPropertystatus(rs.getString(7));

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
	
	public List<PropertyDetails> fetchAllRecordOfSolds()
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		ResultSet rs=null;
		List<PropertyDetails> Propertylist=new ArrayList<PropertyDetails>();
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("select * from PropertyDetails where propertystatus=?");
			pst.setString(1,"SOLD");
			// number of questions marks
			rs=pst.executeQuery();
			while(rs.next()) {
				PropertyDetails userobj=new PropertyDetails();
				userobj.setPropertyid(rs.getString(1));
				userobj.setSelleremail(rs.getString(2));
				userobj.setPropertystate(rs.getString(3));
				userobj.setPropertytype(rs.getString(4));
				userobj.setPropertyprice(rs.getString(5));
				userobj.setPropertyaddress(rs.getString(6));
				userobj.setPropertystatus(rs.getString(7));

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
	
	
	
	public List<PropertyDetails> fetchAllRecordOfNotSolds()
	{
		Connection conobj=null;
		PreparedStatement pst=null;
		boolean f= false;
		ResultSet rs=null;
		List<PropertyDetails> Propertylist=new ArrayList<PropertyDetails>();
		try
		{
			conobj=dbconnect.getMySQLConnection();
			pst=conobj.prepareStatement("select * from PropertyDetails where propertystatus=?");
			pst.setString(1,"NOT SOLD");
			// number of questions marks
			rs=pst.executeQuery();
			while(rs.next()) {
				PropertyDetails userobj=new PropertyDetails();
				userobj.setPropertyid(rs.getString(1));
				userobj.setSelleremail(rs.getString(2));
				userobj.setPropertystate(rs.getString(3));
				userobj.setPropertytype(rs.getString(4));
				userobj.setPropertyprice(rs.getString(5));
				userobj.setPropertyaddress(rs.getString(6));
				userobj.setPropertystatus(rs.getString(7));

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
