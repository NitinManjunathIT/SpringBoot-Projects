package in.pwskills.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.pwskills.nitin.beans.Company;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// Start the container
		System.out.println("***********Container Started****************");
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Company company = context.getBean(Company.class);
		System.out.println(company);

		// closing the container
		((ConfigurableApplicationContext) context).close();
		System.out.println("***********Container Stopped****************");
	}

}
