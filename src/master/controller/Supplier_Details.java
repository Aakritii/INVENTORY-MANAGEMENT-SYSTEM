package master.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier_Details {
	@Id
	@Column(length = 5)
	String sid;
	@Column(length = 25)
	String sname;
	@Column(length = 5)
	String plotno;
	@Column(length = 15)
	String street_name;
	@Column(length = 15)
	int pincode;
	@Column(length = 15)
	String country;
	@Column(length = 12)
	int sphno;
	
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
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSphno() {
		return sphno;
	}
	public void setSphno(int sphno) {
		this.sphno = sphno;
	}
	
}
