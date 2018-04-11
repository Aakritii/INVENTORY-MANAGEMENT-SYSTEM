package master.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer_Details {
	@Id
	@Column(length = 5)
	String cid;
	@Column(length = 5)
	String c_sid;
	@Column(length = 15)
	String cname;
	@Column(length = 6)
	String plotno;
	@Column(length = 10)
	String street_name;
	@Column(length = 6)
	int pincode;
	@Column(length = 10)
	String country;
	@Column(length = 11)
	int cphn;
	@Column(length = 5)
	String c_pid;
	@Column(length = 6)
	int c_pqty;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
	public int getCphn() {
		return cphn;
	}
	public void setCphn(int cphn) {
		this.cphn = cphn;
	}
	public String getC_sid() {
		return c_sid;
	}
	public void setC_sid(String c_sid) {
		this.c_sid = c_sid;
	}
	public String getC_pid() {
		return c_pid;
	}
	public void setC_pid(String c_pid) {
		this.c_pid = c_pid;
	}
	public int getC_pqty() {
		return c_pqty;
	}
	public void setC_pqty(int c_pqty) {
		this.c_pqty = c_pqty;
	}
}
