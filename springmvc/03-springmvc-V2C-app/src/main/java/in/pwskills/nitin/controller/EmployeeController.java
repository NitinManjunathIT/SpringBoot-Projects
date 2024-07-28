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
	 *    DISPLAY THE FORM
	 * 1. METHOD TYPE :: GET
	 * 2. PATH        :: /show
	 * 3. R.T         :: Employee.jsp
	 */
	@GetMapping(value="/show")
	public String showForm() {
		return "Employee";
	}
	
	
	/***
	 *  PROCESS THE FORM
	 *  1. METHOD TYPE :: POST
	 *  2. PATH        :: /save
	 *  3. INPUT       :: @ModelAttribute.Model
	 *  4. R.T         :: EmpPage.jsp
	 */
	@PostMapping(value="/save")
	public String saveFormData(  
					@ModelAttribute
					Employee employee,
					Model model
			) 
	{
		System.out.println(employee);
		model.addAttribute("obj", employee);
		return "EmpPage";
	}	
}
