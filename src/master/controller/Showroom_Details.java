package master.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Showroom_Details {
	@Id
	@Column(length = 5)
	String show_id;
	@Column(length = 15)
	String show_name;
	@Column(length = 5)
	String plotno;
	@Column(length = 15)
	String street_name;
	@Column(length = 15)
	int pincode;
	@Column(length = 15)
	String country;
	@Column(length = 15)
	int show_phno;
	public String getShow_id() {
		return show_id;
	}
	public void setShow_id(String show_id) {
		this.show_id = show_id;
	}
	public String getShow_name() {
		return show_name;
	}
	public void setShow_name(String show_name) {
		this.show_name = show_name;
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
	public int getShow_phno() {
		return show_phno;
	}
	public void setShow_phno(int show_phno) {
		this.show_phno = show_phno;
	}
	
}
