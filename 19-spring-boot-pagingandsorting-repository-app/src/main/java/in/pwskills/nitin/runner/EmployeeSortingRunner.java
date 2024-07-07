package in.pwskills.nitin.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IEmployeePagingSortingRepository;

@Component
public class EmployeeSortingRunner implements CommandLineRunner {

	@Autowired
	IEmployeePagingSortingRepository repo;

	@Override
	public void run(String... args) throws Exception {

		// select * from employee order by esal asc;
		repo.findAll(Sort.by("empSal")).forEach(System.out::println);

		// select * from employee order by esal desc;
		repo.findAll(Sort.by(Direction.DESC, "empSal")).forEach(System.out::println);

		//select * from employee order by esal asc,edept asc;
		repo.findAll(Sort.by("empSal","empDept")).forEach(System.out::println);
	
		//select * from employee order by esal desc,edept desc;
		repo.findAll(Sort.by(Direction.DESC, "empSal","empDept")).forEach(System.out::println);
	
		//select * from employee order by esal asc,edept desc;
		repo.findAll(Sort.by(Order.asc("empSal"),Order.desc("empDept"))).forEach(System.out::println);
	}
}




