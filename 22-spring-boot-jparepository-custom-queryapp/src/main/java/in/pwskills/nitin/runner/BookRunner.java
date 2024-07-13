package in.pwskills.nitin.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IBookRepository;
import in.pwskills.nitin.entity.Book;

@Component
public class BookRunner implements CommandLineRunner {

	@Autowired
	private IBookRepository repo;

	@Override
	public void run(String... args) throws Exception {

		repo.saveAll(Arrays.asList(new Book(101, "SBMS", "NITIN", 300.0, "Backend"),
				new Book(102, "CORE", "HAIDER", 200.0, "Backend"), new Book(103, "ADV", "ZABI", 400.0, "Backend"),
				new Book(104, "REACT", null, 500.0, "Frontend"), new Book(105, "HTML", "NITIN", 600.0, "Frontend"),
				new Book(106, "CSS", null, 300.0, "Frontend"), new Book(107, "ANGULAR", "SACHIN", 800.0, "Frontend"),
				new Book(108, "SQL", "ZABI", 200.0, "Database")));

		repo.findByAuthor("zabi").forEach(System.out::println);

		repo.findByBookCostGreaterThanEqual(300).forEach(System.out::println);
		
		repo.findByBookIdIn(List.of(101, 105)).forEach(System.out::println);
	
		repo.findByBookIdBetween(101, 103).forEach(System.out::println);
		
		repo.findByBookIdLessThanEqualOrBookTypeLike(101, "backend").forEach(System.out::println);
	
		repo.findByBookCostNotAndAuthorNotLike(500.0, "%R%").forEach(System.out::println);
		
		repo.findByBookId(10).ifPresentOrElse(System.out::println, ()->System.out.println("Record not found for the given id "));
	
		repo.findByAuthorIsNull().forEach(System.out::println);
		
		repo.findByAuthorIsNotNull().forEach(System.out::println);
	}
}
