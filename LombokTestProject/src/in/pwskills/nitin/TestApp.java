package in.pwskills.nitin;

import in.pwskills.nitin.bean.Employee;

public class TestApp {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("sachin");
		employee.setEaddress("MI");

		System.out.println(employee);
		
		
		Employee employee2 = new Employee(7, "dhoni", "CSK");
		System.out.println(employee2);
	}
}
