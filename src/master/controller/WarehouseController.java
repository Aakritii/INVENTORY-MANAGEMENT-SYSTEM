package master.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WarehouseController {
		@RequestMapping("/WarehouseAction.htm")
		public ModelAndView registration() {
			ModelAndView mv1 = new ModelAndView("Warehouse");
			return mv1;
		}
		
		@RequestMapping("/RegActWarehouse.htm")
		public ModelAndView getData(@ModelAttribute("ware")Warehouse_Details ware) {
			
			Warehouse_Details smt = new Warehouse_Details();
			smt.setWid(ware.getWid());
			smt.setWname(ware.getWname());
			smt.setPlotno(ware.getPlotno());
			smt.setStreet_name(ware.getStreet_name());
			smt.setPincode(ware.getPincode());
			smt.setCountry(ware.getCountry());
			smt.setWphno(ware.getWphno());
			
			
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
			WarehouseDAO supdao = (WarehouseDAO) factory.getBean("wdao");
			supdao.insertData(ware);
			
			ModelAndView mv2 = new ModelAndView("Display_Warehouse");
			return mv2;
		}
}
