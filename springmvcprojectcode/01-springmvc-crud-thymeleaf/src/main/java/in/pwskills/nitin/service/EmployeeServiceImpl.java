package in.pwskills.nitin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.exception.EmployeeNotFoundException;
import in.pwskills.nitin.model.Employee;
import in.pwskills.nitin.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repo;

	@Override
	public void saveRecord(Employee employee) {
		repo.save(employee);
	}

	@Override
	public List<Employee> displayAllRecords() {
		return repo.findAll();
	}

	@Override
	public void deleteRecord(Integer eid) {
		repo.delete(repo.findById(eid).orElseThrow(
				()->new EmployeeNotFoundException("record not found for deletion")));
	}

}
