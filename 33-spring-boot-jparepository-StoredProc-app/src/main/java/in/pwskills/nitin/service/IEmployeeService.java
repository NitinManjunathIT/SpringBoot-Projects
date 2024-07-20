package in.pwskills.nitin.service;

import java.util.List;

import in.pwskills.nitin.entity.Employee;

public interface IEmployeeService {
	public  List<Employee>  searchEmpsByDesgs(String desg1,String desg2);
}
