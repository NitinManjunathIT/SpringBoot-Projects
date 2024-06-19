package in.pwskills.nitin;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.pwskills.nitin.beans.WishMessageGenerator;

@SpringBootApplication
public class Application {

	static {
		System.out.println("Application.class file is loading...");
	}

	public Application() {
		System.out.println("Application Object is created...");
	}

	@Bean(name = "ldt")
	public LocalDateTime ldtObj() {
		System.out.println("Bean created with name :: ldt -> Application.ldtObj()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		// Start the container
		System.out.println("***********Container Started****************");
		
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Name of the container is :: " + context.getClass().getName());
		
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		String status = wmg.wishMessage("sachin");
		System.out.println(status);
		((ConfigurableApplicationContext) context).close();
		System.out.println("***********Container Stopped****************");
	}

}
