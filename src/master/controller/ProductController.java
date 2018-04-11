package master.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
		@RequestMapping("/ProductAction.htm")
		public ModelAndView registration() {
			ModelAndView mv1 = new ModelAndView("Product");
			return mv1;
		}
		
		@RequestMapping("/RegActProduct.htm")
		public ModelAndView getData(@ModelAttribute("prod") Product_Details prod) {
			
			Product_Details prod1 = new Product_Details();
			
			prod1.setPid(prod.getPid());
			prod1.setPname(prod.getPname());
			prod1.setPcolor(prod.getPcolor());
			prod1.setPmanuf(prod.getPmanuf());
			prod1.setPprice(prod.getPprice());
			
			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
			ProductDAO product_dao = (ProductDAO) factory.getBean("pdao");
			product_dao.insertData(prod);
			
			ModelAndView mv2 = new ModelAndView("Display_Product");
			return mv2;
		}
}
