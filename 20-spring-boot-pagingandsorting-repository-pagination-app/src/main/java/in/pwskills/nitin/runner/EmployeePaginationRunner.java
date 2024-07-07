package in.pwskills.nitin.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IEmployeePagingSortingRepository;
import in.pwskills.nitin.entity.Employee;

@Component
public class EmployeePaginationRunner implements CommandLineRunner {

	@Autowired
	IEmployeePagingSortingRepository repo;

	@Override
	public void run(String... args) throws Exception {

		// pageNum = 1, pageSize = 3
		// select * from employee limit ?,?
		// noOfpages = totalrecords/pageSize
		repo.findAll(PageRequest.of(1, 3)).forEach(System.out::println);

		// pageNum = 3, pageSize = 2
		// select * from employee limit ?,?;
		// noOfpages = totalrecords/pageSize
		repo.findAll(PageRequest.of(3, 2)).forEach(System.out::println);

		Page<Employee> page = repo.findAll(PageRequest.of(2, 4));
		page.forEach(System.out::println);
		System.out.println("Has Next Page :: " + page.hasNext());
		System.out.println("Has Previous Page :: " + page.hasPrevious());
		System.out.println("Is First Page     :: " + page.isFirst());
		System.out.println("Is Last  Page     :: " + page.isLast());
		System.out.println("Is Page Empty     :: " + page.isEmpty());
		System.out.println("Total no of pages :: " + page.getTotalPages());
		System.out.println("Total records     :: " + page.getTotalElements());
		System.out.println("Each page size    :: " + page.getSize());
		System.out.println("Page has content  :: " + page.hasContent());

	}
}
