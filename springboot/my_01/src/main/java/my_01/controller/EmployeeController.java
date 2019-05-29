package my_01.controller;

import my_01.dao.EmployeeDao;
import my_01.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;
	@RequestMapping("/emps")
	public String list(Model model){

		Collection<Employee> employees = employeeDao.getAll();
		model.addAttribute("emps",employees);
		return "emp/list";
	}
}
