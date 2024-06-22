package in.pwskills.nitin;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.pwskills.nitin.beans.Employee;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// Start the container
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		
		DataSource source = context.getBean(DataSource.class);
		System.out.println("DataSource is :: "+source.getClass().getName());
		
		System.out.println();

		// closing the container
		((ConfigurableApplicationContext) context).close();
	}

}
