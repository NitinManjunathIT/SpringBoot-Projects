package in.pwskills.nitin.beans;

import org.springframework.stereotype.Component;

@Component("ui")
public final class UICourseMaterial implements ICourseMaterial {

	static {
		System.out.println("UICourseMaterial.class file is loading...");
	}

	public UICourseMaterial() {
		System.out.println("UICourseMaterial Object is created...");
	}
	
	
	@Override
	public String courseContent() {
		return "1. HTML 2. CSS 3. JS ....";
	}

	@Override
	public Double price() {
		return 4000.0;
	}

}
