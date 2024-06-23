package in.pwskills.nitin.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.beans.Employee;
import in.pwskills.nitin.beans.Student;

@Component
@Order(5)
public class StudentRunner implements ApplicationRunner, Ordered {

	@Autowired
	private Employee employee;

	@Autowired
	private Student student;

	static {
		System.out.println("StudentRunner.class file is loading...");
	}

	public StudentRunner() {
		System.out.println("StudentRunner Object is created...");
	}

	// Called by the container automatically
	// After creation of all object of singleton scope
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\nStudentRunner.run()");
		System.out.println(employee);
		System.out.println(student);

		System.out.println("Application- Arguments passed are :: ");
		System.out.println("Optional Args are :: " + args.getOptionNames()); // --key = val
		System.out.println("NonOptional Args are :: " + args.getNonOptionArgs());// val
	}

	@Override
	public int getOrder() {
		System.out.println("StudentRunner.getOrder()");
		return 15;
	}

}
