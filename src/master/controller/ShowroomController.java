package master.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowroomController {
		@RequestMapping("/ShowroomAction.htm")
		public ModelAndView registration() {
			ModelAndView mv1 = new ModelAndView("Showroom");
			return mv1;
		}
		
		@RequestMapping("/RegActShowroom.htm")
		public ModelAndView getData(@ModelAttribute("show") Showroom_Details show) {
			
			Showroom_Details sd = new Showroom_Details();
			sd.setShow_id(show.getShow_id());
			sd.setShow_name(show.getShow_name());
			sd.setPlotno(show.getPlotno());
			sd.setStreet_name(show.getStreet_name());
			sd.setPincode(show.getPincode());
			sd.setCountry(show.getCountry());
			sd.setShow_phno(show.getShow_phno());
					
			
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
			ShowroomDAO show_dao = (ShowroomDAO) factory.getBean("shdao");
			show_dao.insertData(show);
			
			ModelAndView mv2 = new ModelAndView("Display_Showroom");
			return mv2;
		}
}
