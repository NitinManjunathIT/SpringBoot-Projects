package in.pwskills.nitin.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.pwskills.nitin.model.Employee;

public interface IEmployeeService {

	// save the record
	void saveRecord(Employee employee);

	// display the record
	Page<Employee> displayAllRecords(Pageable pageable);
	
	//delete the record
	void deleteRecord(Integer eid);
	
	//get the record
	Employee findEmployee(Integer eid);
}
