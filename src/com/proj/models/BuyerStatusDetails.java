package com.proj.models;
import java.io.*;

public class BuyerStatusDetails implements Serializable 
{
 private String buyname;
 private String buyemail;
 public BuyerStatusDetails() {
	super();
}
public String getBuyname() {
	return buyname;
}
public void setBuyname(String buyname) {
	this.buyname = buyname;
}
public String getPropertystatus() {
	return propertystatus;
}
public void setPropertystatus(String propertystatus) {
	this.propertystatus = propertystatus;
}
public String getBuyemail() {
	return buyemail;
}
public void setBuyemail(String buyemail) {
	this.buyemail = buyemail;
}
public String getPropertyid() {
	return propertyid;
}
public void setPropertyid(String propertyid) {
	this.propertyid = propertyid;
}
private String propertyid;
private String propertystatus;

}
