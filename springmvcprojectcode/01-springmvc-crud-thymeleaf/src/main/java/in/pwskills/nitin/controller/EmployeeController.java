package in.pwskills.nitin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

		//redirect to display the record
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
	public String displayEmployeeList(Model model,
									@PageableDefault(page = 0,size = 3) 
										Pageable pageable
									) 
	{
		
		//Get all records from database based on pageNumber
		Page<Employee> page = service.displayAllRecords(pageable);
		
		
		//keep in model and send to UI
		model.addAttribute("employees", page.getContent());
		model.addAttribute("page", page);
		
		return "/employee/list-employees";
	}
	
	
	
	/****
	 * 				Delete the Employee based on id
	 *  1. Collect ID from the user
	 *  2. METHOD : POST
	 *  3. ACTION : /delete
	 *  4. R.T    : list-employees
	 *  5. INPUT  : ID @RequestParam
	 */
	
	@PostMapping("/delete")
	public String deleteEmployee(
			@RequestParam("empId")
			Integer eid
			) {
		
		service.deleteRecord(eid);
		
		return "redirect:/employee/list";
	}
	
	/****
	 * 				Display the Employee Data on a form based on id
	 *  1. Collect ID from the user
	 *  2. METHOD : POST
	 *  3. ACTION : /showFormForUpdate
	 *  4. R.T    : employee-form
	 *  5. INPUT  : Model, ID @RequestParam
	 */
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(
			@RequestParam("empId")
			Integer eid,
			Model model
			) {
		
		//retrieve employee based on id
		Employee employee = service.findEmployee(eid);
		
		//add employee and send it to UI
		model.addAttribute("employee", employee);
		
		//send the form by carrying the employee object
		return "/employee/employee-form";
	}

	
}








