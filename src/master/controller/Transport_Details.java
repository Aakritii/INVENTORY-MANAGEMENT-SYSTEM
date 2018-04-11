package master.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transport_Details {
	@Id
	@Column(length = 5)
	String tid;
	@Column(length = 15)
	String tname;
	@Column(length = 10)
	String tmode;
	@Column(length = 15)
	String towner;
	@Column(length = 15)
	int tphno;
	
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTmode() {
		return tmode;
	}
	public void setTmode(String tmode) {
		this.tmode = tmode;
	}
	public String getTowner() {
		return towner;
	}
	public void setTowner(String towner) {
		this.towner = towner;
	}
	public int getTphno() {
		return tphno;
	}
	public void setTphno(int tphno) {
		this.tphno = tphno;
	}
	
		
}
