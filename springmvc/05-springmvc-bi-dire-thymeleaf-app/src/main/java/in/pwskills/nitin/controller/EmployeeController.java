package in.pwskills.nitin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.pwskills.nitin.bean.Employee;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	/***
	 * 1. METHOD TYPE :: GET
	 * 2. INPUT       :: @ModelAttribute,Model
	 * 3. PATH        :: /showForm
	 * 4. R.T         :: EmployeeForm
	 * 
	 */
	@GetMapping(value = "/showForm")
	public String showForm(@ModelAttribute  Employee employee,
							Model model
						) {
		model.addAttribute("employee", employee);
		return "EmployeeForm";
	}
	
	/***
	 * 1. METHOD TYPE :: POST
	 * 2. INPUT       :: @ModelAttribute Model
	 * 3. PATH        :: /save
	 * 4. R.T         :: EmployeeForm
	 * 
	 */
	@PostMapping("/save")
	public String saveFormData(
			@ModelAttribute 
			Employee employee,
			Model model) {
		
		model.addAttribute("employee", employee);
		
		return "EmployeeForm";
	}
}
