package in.pwskills.nitin.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.beans.Employee;
import in.pwskills.nitin.beans.Student;

@Component
@Order(10)
public class EmployeeRunner implements ApplicationRunner {

	static {
		System.out.println("EmployeeRunner.class file is loading...");
	}

	public EmployeeRunner() {
		System.out.println("EmployeeRunner Object is created...");
	}
	
	@Autowired
	private Employee employee;

	@Autowired
	private Student student;

	// Called by the container automatically
	// After creation of all object of singleton scope
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nEmployeeRunner.run()");
		System.out.println(employee);
		System.out.println(student);

		System.out.println("Application- Arguments passed are :: ");
		System.out.println("Optional Args are :: "+args.getOptionNames()); //--key = val
		System.out.println("NonOptional Args are :: "+args.getNonOptionArgs());//val
		System.out.println("Source Arguments are :: "+Arrays.toString(args.getSourceArgs()));
		
	}

}
