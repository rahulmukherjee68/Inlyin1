package com.proj.models;

import java.io.Serializable;

public class BuyerDetails implements Serializable
{

	private String buyname;
	private String buyemail;
	private String buyaddress;
	public String getBuyname() {
		return buyname;
	}
	public void setBuyname(String buyname) {
		this.buyname = buyname;
	}
	public String getBuyemail() {
		return buyemail;
	}
	public void setBuyemail(String buyemail) {
		this.buyemail = buyemail;
	}
	public String getBuyaddress() {
		return buyaddress;
	}
	public void setBuyaddress(String buyaddress) {
		this.buyaddress = buyaddress;
	}
	public String getBuymob() {
		return buymob;
	}
	public void setBuymob(String buymob) {
		this.buymob = buymob;
	}
	public String getBuypass() {
		return buypass;
	}
	public void setBuypass(String buypass) {
		this.buypass = buypass;
	}
	public BuyerDetails() {
		super();
	}
	private String buymob;
	private String buypass;
	
}
