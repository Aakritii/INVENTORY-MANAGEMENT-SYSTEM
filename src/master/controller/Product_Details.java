package master.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product_Details {
	@Id
	@Column(length = 5)
	String pid;
	@Column(length = 25)
	String pname;
	@Column(length = 15)
	String pcolor;
	@Column(length = 25)
	String pmanuf;
	@Column(length = 15)
	int pprice;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcolor() {
		return pcolor;
	}
	public void setPcolor(String pcolor) {
		this.pcolor = pcolor;
	}
	public String getPmanuf() {
		return pmanuf;
	}
	public void setPmanuf(String pmanuf) {
		this.pmanuf = pmanuf;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
}
