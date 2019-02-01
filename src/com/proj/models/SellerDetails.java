package com.proj.models;

import java.io.*;

public class SellerDetails implements Serializable
{
	public String getSellname() {
		return sellname;
	}
	public void setSellname(String sellname) {
		this.sellname = sellname;
	}
	public String getSellemail() {
		return sellemail;
	}
	public void setSellemail(String sellemail) {
		this.sellemail = sellemail;
	}
	public String getSelladdress() {
		return selladdress;
	}
	public void setSelladdress(String selladdress) {
		this.selladdress = selladdress;
	}
	public String getSellmob() {
		return sellmob;
	}
	public void setSellmob(String sellmob) {
		this.sellmob = sellmob;
	}
	public String getSellpass() {
		return sellpass;
	}
	public void setSellpass(String sellpass) {
		this.sellpass = sellpass;
	}
	public SellerDetails() {
		super();
	}
	private String sellname;
	private String sellemail;
	private String selladdress;
	private String sellmob;
	private String sellpass;
}
