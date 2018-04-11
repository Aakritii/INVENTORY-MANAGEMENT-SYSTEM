package master.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PortController {
		@RequestMapping("/PortAction.htm")
		public ModelAndView registration() {
			ModelAndView mv1 = new ModelAndView("Port");
			return mv1;
		}
		
		@RequestMapping("/RegActPort.htm")
		public ModelAndView getData(@ModelAttribute("port") Port_Details port) {
			
			Port_Details pd = new Port_Details();
			pd.setPort_id(port.getPort_id());
			pd.setPort_name(port.getPort_name());
			pd.setPort_loc(port.getPort_loc());
			pd.setPort_phn(port.getPort_phn());
					
			
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
			PortDAO port_dao = (PortDAO) factory.getBean("ptdao");
			port_dao.insertData(port);
			
			ModelAndView mv2 = new ModelAndView("Display_Port");
			return mv2;
	}
}
