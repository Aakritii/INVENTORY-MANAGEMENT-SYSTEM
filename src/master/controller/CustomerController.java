package master.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class CustomerController {
		@RequestMapping("/CustomerAction.htm")
		public ModelAndView registration() {
			ModelAndView mv1 = new ModelAndView("Customer");
			return mv1;
		}
		
		@RequestMapping("/RegActCustomer.htm")
		public ModelAndView getData(@ModelAttribute("cust") Customer_Details cust) {
			
			Customer_Details cd = new Customer_Details();
			Product_Details pd = new Product_Details();
			Showroom_Details sd = new Showroom_Details();
			
			cd.setCid(cust.getCid());
			cd.setC_sid(sd.getShow_id());
			cd.setCname(cust.getCname());
			cd.setPlotno(cust.getPlotno());
			cd.setStreet_name(cust.getStreet_name());
			cd.setPincode(cust.getPincode());
			cd.setCountry(cust.getCountry());
			cd.setCphn(cust.getCphn());
			cd.setC_pid(cust.getC_pid());
			cd.setC_pqty(cust.getC_pqty());
			
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
			CustomerDAO customer_dao = (CustomerDAO) factory.getBean("cdao");
			customer_dao.insertData(cust);
			
			ModelAndView mv2 = new ModelAndView("Display_Customer");
			return mv2;
		}
}
