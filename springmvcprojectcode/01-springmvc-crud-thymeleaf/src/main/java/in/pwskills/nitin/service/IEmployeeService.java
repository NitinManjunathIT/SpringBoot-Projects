package in.pwskills.nitin.service;

import java.util.List;

import in.pwskills.nitin.model.Employee;

public interface IEmployeeService {

	// save the record
	void saveRecord(Employee employee);

	// display the record
	List<Employee> displayAllRecords();

}
