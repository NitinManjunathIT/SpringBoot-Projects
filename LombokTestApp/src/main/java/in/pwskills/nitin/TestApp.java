package in.pwskills.nitin;

import in.pwskills.nitin.bean.Employee;

public class TestApp {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEid(10);
		emp1.setEname("sachin");
		emp1.setEaddress("MI");
		emp1.setEsalary(12345.5f);
		System.out.println(emp1);

		Employee emp2 = new Employee(7, "dhoni", "CSK", 23456.5f);
		System.out.println(emp2);

		Employee emp3 = new Employee(18, "kohli", "RCB");
		System.out.println(emp3);
	}
}
