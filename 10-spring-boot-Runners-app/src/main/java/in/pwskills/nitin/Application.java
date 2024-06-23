package in.pwskills.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		System.out.println("Container started...");
		
		//Perform some startup activities + create an object for all beans(singleton) + DI(singleton) 
		//calls run() of such classes which implements XXXXXRunner only once after the creation of Container
		SpringApplication.run(Application.class, args);
		
		System.out.println("Container stopped...");
	}
}
