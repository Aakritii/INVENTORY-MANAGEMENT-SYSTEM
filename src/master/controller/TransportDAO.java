package master.controller;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class TransportDAO {
	HibernateTemplate hibernatetemplate;

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	public void insertData(Transport_Details pd) {
		getHibernatetemplate().save(pd);
	}
	public List getData() {
		String hql="from Transport_Details";
		List results = getHibernatetemplate().find(hql);
		return results;
				
	}
	
}
