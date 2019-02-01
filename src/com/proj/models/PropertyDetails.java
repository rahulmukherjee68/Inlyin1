
package com.proj.models;

import java.io.Serializable;

public class PropertyDetails implements Serializable
{
	private String propertyid;
	private String selleremail;
	private String propertystate;
	public String getPropertyid() {
		return propertyid;
	}
	public void setPropertyid(String propertyid) {
		this.propertyid = propertyid;
	}
	public String getSelleremail() {
		return selleremail;
	}
	public void setSelleremail(String selleremail) {
		this.selleremail = selleremail;
	}
	public String getPropertystate() {
		return propertystate;
	}
	public void setPropertystate(String propertystate) {
		this.propertystate = propertystate;
	}
	public String getPropertytype() {
		return propertytype;
	}
	public void setPropertytype(String propertytype) {
		this.propertytype = propertytype;
	}
	public PropertyDetails() {
		super();
	}
	public String getPropertyprice() {
		return propertyprice;
	}
	public void setPropertyprice(String propertyprice) {
		this.propertyprice = propertyprice;
	}
	public String getPropertystatus() {
		return propertystatus;
	}
	public void setPropertystatus(String propertystatus) {
		this.propertystatus = propertystatus;
	}
	public String getPropertyaddress() {
		return propertyaddress;
	}
	public void setPropertyaddress(String propertyaddress) {
		this.propertyaddress = propertyaddress;
	}

	private String propertytype;
	private String propertyprice;
	private String propertyaddress;
	private String propertystatus;

}
