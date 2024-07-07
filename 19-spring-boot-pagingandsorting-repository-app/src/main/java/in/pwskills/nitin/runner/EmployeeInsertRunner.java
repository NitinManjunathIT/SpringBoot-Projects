package in.pwskills.nitin.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IEmployeeRepository;
import in.pwskills.nitin.entity.Employee;

@Component
@Order(1)
public class EmployeeInsertRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());

		repo.saveAll(
				// List.of(
				Arrays.asList(new Employee(10, "AAB", 200.0, "DEV"), new Employee(11, "AAB", 200.0, "QA"),
						new Employee(12, "AAB", 200.0, "BA"), new Employee(13, "AAB", 300.0, "DEV"),
						new Employee(14, "AAB", 300.0, "QA"), new Employee(15, "AAB", 300.0, "BA"),
						new Employee(16, "AAB", 400.0, "DEV"), new Employee(17, "AAB", 400.0, "QA"),
						new Employee(18, "AAB", 400.0, "BA")));

	}

}
