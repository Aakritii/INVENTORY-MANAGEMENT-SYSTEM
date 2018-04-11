package master.controller;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class PortDAO {
	HibernateTemplate hibernatetemplate;

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	public void insertData(Port_Details pd) {
		getHibernatetemplate().save(pd);
	}
	public List getData() {
		String hql="from Port_Details";
		List results = getHibernatetemplate().find(hql);
		return results;
				
	}
	
}
