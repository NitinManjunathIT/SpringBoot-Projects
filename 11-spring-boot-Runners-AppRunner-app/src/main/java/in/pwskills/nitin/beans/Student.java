package in.pwskills.nitin.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("std.info")
public class Student {

	private Integer sid;
	private String sname;
	private String saddress;

	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student object is created...");
	}

	public void setSid(Integer sid) {
		this.sid = sid;
		System.out.println("Student.setSid()");
	}

	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("Student.setSname()");
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
		System.out.println("Student.setSaddress()");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
}
