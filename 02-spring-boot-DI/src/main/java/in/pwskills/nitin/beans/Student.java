package in.pwskills.nitin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student Object is created...");
	}

	@Autowired
	@Qualifier("courseName")
	private ICourseMaterial material;

	// B.L
	public void preparation(String examName) {
		System.out.println("Preparation started for :: " + examName);

		String content = material.courseContent();
		Double price = material.price();
		System.out.println("Preparation is going on using " + content + " material with price :: " + price);
		System.out.println("Preparation completed for  " + examName);
	}

}
