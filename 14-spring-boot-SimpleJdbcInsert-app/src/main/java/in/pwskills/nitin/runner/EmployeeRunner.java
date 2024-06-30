package in.pwskills.nitin.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.beans.EmployeeDTO;
import in.pwskills.nitin.service.IEmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		int count = service.registerEmployee(new EmployeeDTO("arshadeep", "bowler", 34000.0f, 3, 5));
		System.out.println("No of records inserted is :: " + count);
	}
}
