package EmpControler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import EmployeeDao.EmpDao;
import EmployeeDto.Employee;


@Controller
public class EmpController {

	@Autowired
	EmpDao dao;
	
	@Autowired
	Employee employee;
	
	@RequestMapping("/load")
	public ModelAndView load() {
		ModelAndView andView=new ModelAndView("save.jsp");
		andView.addObject("new",new Employee());
		return andView;
	}
	@RequestMapping("/saveemp")
	public ModelAndView saveemp(@ModelAttribute Employee employee) {
		Employee employee2=dao.SaveEmp(employee);
		if(employee2!=null) {
		ModelAndView andView=new ModelAndView("/display");
		andView.addObject("save","data saved");
		return andView;
		}
		else {
			ModelAndView andView=new ModelAndView("/load");
			return andView;
		}
	}
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String email,String password) {
		ModelAndView andView=new ModelAndView("login.jsp");
		andView.addObject("login",dao.login(employee));
		return andView;
	}
	@RequestMapping("/getbyid")
	public ModelAndView getbyid(@RequestParam int id) {
		ModelAndView andView=new ModelAndView("update.jsp");
		andView.addObject("getbyid",dao.getbyid(id));
		return andView;
	}
	@RequestMapping("/display")
	public ModelAndView displayall() {
		ModelAndView andView=new ModelAndView("display.jsp");
		andView.addObject("li",dao.getAll());
		return andView;
	}
	@RequestMapping("/updateemp")
	public ModelAndView updateemp(@RequestParam int id) {
		ModelAndView andView=new ModelAndView("/display");
		andView.addObject("update",dao.update(employee));
		return andView;
	}
}
