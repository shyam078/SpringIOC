package com.jsp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EMPDao {

	@RequestMapping("/loaded")
	public ModelAndView load() {
		ModelAndView andView=new ModelAndView("emp.jsp");
		andView.addObject("new", new EMPDao());
		return andView;	
	}
	@RequestMapping("/saveemp")
	public ModelAndView saveemp() {
		ModelAndView andView=new ModelAndView("displayemp.jsp");
		
		return andView;	
	}
}