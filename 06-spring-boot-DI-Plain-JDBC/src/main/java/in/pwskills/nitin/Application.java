package in.pwskills.nitin;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.pwskills.nitin.controller.MainController;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, JdbcTemplateAutoConfiguration.class })
public class Application {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Start the container
		ApplicationContext context = SpringApplication.run(Application.class, args);

		// Collecting inputs from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the designation count :: ");
		int count = scanner.nextInt();

		String[] desg = null;

		if (count >= 1) {
			// Create an array for the specified count
			desg = new String[count];
		} else {
			// print invalid message to the user
			System.out.println("Invalid Designation count...");
			return;
		}

		// initialize the array with user input['batsman','bowler']
		for (int i = 0; i < count; i++) {
			System.out.print("Enter the designation :: ");
			desg[i] = scanner.next();
		}

		// Asking the container to give Controller Object
		try {
			MainController controller = context.getBean(MainController.class);
			controller.showEmpByDesg(desg).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// closing the resource
		scanner.close();

		// closing the container
		((ConfigurableApplicationContext) context).close();
	}

}
