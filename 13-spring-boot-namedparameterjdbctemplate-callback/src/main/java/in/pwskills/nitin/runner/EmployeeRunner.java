package in.pwskills.nitin.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.beans.EmployeeDTO;
import in.pwskills.nitin.service.IEmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		int id = 5;
		try {
			System.out.println("Name is ::" + service.fetchEmpNameByEno(id));
		} catch (EmptyResultDataAccessException e) {
			System.out.println("Record not avaialble for the given id :: " + id);
		}

		service.fetchEmployeeDetailsBasedOnDesg("batsman", "bowler").forEach(System.out::println);

		int count = service.registerEmployee(new EmployeeDTO("bumrah", "bowler", 32000.0f,6,5));
		System.out.println("No of records saved is :: " + count);

	}
}
