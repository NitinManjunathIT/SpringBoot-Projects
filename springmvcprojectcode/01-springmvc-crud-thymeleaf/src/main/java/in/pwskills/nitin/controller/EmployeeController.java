package in.pwskills.nitin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.pwskills.nitin.model.Employee;
import in.pwskills.nitin.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	/**
	 * 				Inputting the form to the user 
	 * 1. Display a Form 
	 * 2. METHOD : GET 
	 * 3. ACTION :/showForm
	 * 4. R.T : employee-form 
	 * 5. INPUT : Model
	 */
	@GetMapping("/showForm")
	public String showForm(Model model) {

		// Creating an employee object to display
		Employee employee = new Employee();

		// sending the employee object to view
		model.addAttribute("employee", employee);

		return "/employee/employee-form";
	}

	/***
	 * 					Saving the object 
	 * 1. Save the Object collected from the user 
	 * 2. METHOD : POST
	 * 3. ACTION : /save 
	 * 4. R.T : list-employees 
	 * 5. INPUT : Employee employee @ModelAttribute
	 */
	@PostMapping("/save")
	public String saveEmployeeData(
			@ModelAttribute 
			Employee employee) {

		// save the employee
		service.saveRecord(employee);

		return "redirect:/employee/list";
	}

	/***
	 * 				Retrieve all records and display 
	 * 1. GET ALL RECORDS FROM DB 
	 * 2. METHOD : GET
	 * 3. ACTION : /list 
	 * 4. R.T : list-employees 
	 * 5. INPUT : Model
	 */
	@GetMapping("/list")
	public String displayEmployeeList(Model model) {
		
		//Get all records from database
		List<Employee> employees = service.displayAllRecords();
		
		//keep in model and send to UI
		model.addAttribute("employees", employees);
		
		return "/employee/list-employees";
	}

}
