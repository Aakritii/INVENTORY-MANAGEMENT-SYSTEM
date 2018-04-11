package master.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TransportController {
	@RequestMapping("/TransportAction.htm")
	public ModelAndView registration() {
		ModelAndView mv1 = new ModelAndView("Transport");
		return mv1;
	}
	
	@RequestMapping("/RegActTransport.htm")
	public ModelAndView getData(@ModelAttribute("trans") Transport_Details trans) {
		
		Transport_Details trans1 = new Transport_Details();
		
		
		trans1.setTid(trans.getTid());
		trans1.setTname(trans.getTname());
		trans1.setTmode(trans.getTmode());
		trans1.setTphno(trans.getTphno());
		trans1.setTowner(trans.getTowner());
		
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
		TransportDAO trans_dao = (TransportDAO) factory.getBean("tdao");
		trans_dao.insertData(trans);
		
		ModelAndView mv2 = new ModelAndView("Display_Transport");
		return mv2;
	}
}
