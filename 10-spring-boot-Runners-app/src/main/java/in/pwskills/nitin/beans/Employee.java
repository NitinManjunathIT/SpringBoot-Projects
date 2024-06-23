package in.pwskills.nitin.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("emp.info")
public class Employee {

	private Integer eid;
	private String ename;
	private String eaddress;

	static {
		System.out.println("Employee.class file is loading...");
	}

	public Employee() {
		System.out.println("Employee object is created...");
	}

	public void setEid(Integer eid) {
		this.eid = eid;
		System.out.println("Employee.setEid()");
	}

	public void setEname(String ename) {
		this.ename = ename;
		System.out.println("Employee.setEname()");
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
		System.out.println("Employee.setEaddress()");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}

}
