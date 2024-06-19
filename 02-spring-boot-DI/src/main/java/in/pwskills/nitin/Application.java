package in.pwskills.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import in.pwskills.nitin.beans.Student;

@SpringBootApplication
@ImportResource("in/pwskills/nitin/cfgs/applicationContext.xml")
public class Application {

	static {
		System.out.println("Application.class file is loading...");
	}

	public Application() {
		System.out.println("Application Object is created...");
	}

	public static void main(String[] args) {
		// Start the container
		System.out.println("***********Container Started****************");
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		System.out.println("Name of the container is :: " + context.getClass().getName());
		Student std = context.getBean(Student.class);
		std.preparation("CTS-INTERVIEW");
		
		//closing the container
		((ConfigurableApplicationContext) context).close();
		System.out.println("***********Container Stopped****************");
	}

}
