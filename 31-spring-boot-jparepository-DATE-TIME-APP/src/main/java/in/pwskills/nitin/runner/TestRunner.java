package in.pwskills.nitin.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.ICustomeRepository;
import in.pwskills.nitin.entity.Customer;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ICustomeRepository repo;

	@Override
	public void run(String... args) throws Exception {

		Customer cust = new Customer(10,"NITIN", "BENGALURU", 
				LocalDateTime.of(1993, 1,3, 19, 45, 3), 
				LocalTime.now(),
				LocalDate.now());

		repo.save(cust);
		System.out.println("*****Customer object is saved******");
		
		repo.findAll().forEach(System.out::println);

	}
}
