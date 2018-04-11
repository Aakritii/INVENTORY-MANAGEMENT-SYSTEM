package master.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Warehouse_Details {
	@Id
	@Column(length = 5)
	String wid;
	@Column(length = 15)
	String wname;
	@Column(length = 6)
	String plotno;
	@Column(length = 10)
	String street_name;
	@Column(length = 11)
	int pincode;
	@Column(length = 8)
	String country;
	@Column(length = 12)
	int wphno;
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getPlotno() {
		return plotno;
	}
	public void setPlotno(String plotno) {
		this.plotno = plotno;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getWphno() {
		return wphno;
	}
	public void setWphno(int wphno) {
		this.wphno = wphno;
	}
	
}
