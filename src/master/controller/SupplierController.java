package master.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SupplierController {
	@RequestMapping("/SupplierAction.htm")
	public ModelAndView registration() {
		ModelAndView mv1 = new ModelAndView("Supplier");
		return mv1;
	}
	
	@RequestMapping("/RegActSupplier.htm")
	public ModelAndView getData(@ModelAttribute("sup")Supplier_Details sup) {
		
		Supplier_Details smt = new Supplier_Details();
		smt.setSid(sup.getSid());
		smt.setSname(sup.getSname());
		smt.setPlotno(sup.getPlotno());
		smt.setStreet_name(sup.getStreet_name());
		smt.setPincode(sup.getPincode());
		smt.setCountry(sup.getCountry());
		smt.setSphno(sup.getSphno());
		
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
		SupplierDAO supdao = (SupplierDAO) factory.getBean("sdao");
		supdao.insertData(sup);
		
		ModelAndView mv2 = new ModelAndView("Display_Supplier");
		return mv2;
	}
}
