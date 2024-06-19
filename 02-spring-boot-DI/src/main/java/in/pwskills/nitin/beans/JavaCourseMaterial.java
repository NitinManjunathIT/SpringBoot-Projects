package in.pwskills.nitin.beans;

import org.springframework.stereotype.Component;

@Component("java")
public final class JavaCourseMaterial implements ICourseMaterial {

	static {
		System.out.println("JavaCourseMaterial.class file is loading...");
	}

	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial Object is created...");
	}

	@Override
	public String courseContent() {
		return "1. OOPS 2. ExceptionHandling 3. Collections ...";
	}

	@Override
	public Double price() {
		return 5000.0;
	}

}
