package master.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VesselController {
		@RequestMapping("/VesselAction.htm")
		public ModelAndView registration() {
			ModelAndView mv1 = new ModelAndView("Vessel");
			return mv1;
		}
		@RequestMapping("/RegActVessel.htm")
		public ModelAndView getData(@ModelAttribute("ves") Vessel_Details ves) {
			
			Vessel_Details vs = new Vessel_Details();
			vs.setVid(ves.getVid());
			vs.setVname(ves.getVname());
			
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
			VesselDAO vesdao = (VesselDAO) factory.getBean("vdao");
			vesdao.insertData(ves);
			
			ModelAndView mv2 = new ModelAndView("Display_Vessel");
			return mv2;
		}
}
