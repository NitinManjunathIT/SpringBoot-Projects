package in.pwskills.nitin.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IDepartmentRepository;
import in.pwskills.nitin.dao.IEmployeeRepository;
import in.pwskills.nitin.entity.Department;
import in.pwskills.nitin.entity.Employee;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository erepo;

	@Autowired
	private IDepartmentRepository drepo;

	@Override
	public void run(String... args) throws Exception {

		Department d1 = new Department(1054, "DEV", "AJAY");
		Department d2 = new Department(1055, "QA", "SAM");
		Department d3 = new Department(1056, "BA", "KUMAR");

		drepo.save(d1);
		drepo.save(d2);
		drepo.save(d3);

		Employee e1 = new Employee(10, "SAM", 500.0, d1);
		Employee e2 = new Employee(11, "RAM", 600.0, d2);
		Employee e3 = new Employee(12, "SYED", 700.0, d1);
		Employee e4 = new Employee(13, "AJAY", 700.0, null);

		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);

		
		Optional<Employee> employee = erepo.findById(10);
		if (employee.isPresent()) {
			System.out.println(employee.get());
		} else {
			System.out.println("Employee not found...");
		}

	}
}
