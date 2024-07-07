package in.pwskills.nitin.runner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.dao.IStudentRepository;
import in.pwskills.nitin.entity.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private IStudentRepository repo;

	@Override
	public void run(String... args) throws Exception {

		repo.saveAll(

				Arrays.asList(new Student("sachin", 300.0, new Date()), new Student("dhoni", 400.0, new Date()),
						new Student("kohli", 300.0, new Date()), new Student("rohith", 400.0, new Date())

				));

		// select * from student;
		List<Student> list = repo.findAll();
		System.out.println(list.getClass().getName());
		list.forEach(System.out::println);

		// select * from student where stdId = ?
		repo.findById(1).ifPresentOrElse(System.out::println, () -> {
			System.out.println("No record");
		});

		Student std = new Student();
		std.setStdName("rohith");
		std.setStdFee(400.0);

		repo.findAll(Example.of(std)).forEach(System.out::println);

	}

}
