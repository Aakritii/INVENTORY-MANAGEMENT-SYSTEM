package master.controller;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class VesselDAO {
	HibernateTemplate hibernatetemplate;

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	public void insertData(Vessel_Details sm) {
		getHibernatetemplate().save(sm);
	}
	public List getData() {
		String hql="from Vessel_Details";
		List results = getHibernatetemplate().find(hql);
		return results;
				
	}
	
}
