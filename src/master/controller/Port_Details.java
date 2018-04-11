package master.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Port_Details {
	@Id
	@Column(length = 6)
	String port_id;
	@Column(length = 12)
	String port_name;
	@Column(length = 10)
	String port_loc;
	@Column(length = 12)
	int port_phn;
	public String getPort_id() {
		return port_id;
	}
	public void setPort_id(String port_id) {
		this.port_id = port_id;
	}
	public String getPort_name() {
		return port_name;
	}
	public void setPort_name(String port_name) {
		this.port_name = port_name;
	}
	public String getPort_loc() {
		return port_loc;
	}
	public void setPort_loc(String port_loc) {
		this.port_loc = port_loc;
	}
	public int getPort_phn() {
		return port_phn;
	}
	public void setPort_phn(int port_phn) {
		this.port_phn = port_phn;
	}
	
}
