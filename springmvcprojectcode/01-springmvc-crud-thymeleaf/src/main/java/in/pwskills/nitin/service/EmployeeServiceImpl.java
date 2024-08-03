package in.pwskills.nitin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<Employee> displayAllRecords(Pageable pageable) {
		return repo.findAll(pageable);
	}

	@Override
	public void deleteRecord(Integer eid) {
		repo.delete(
				repo.findById(eid).orElseThrow(() -> new EmployeeNotFoundException("record not found for deletion")));
	}

	@Override
	public Employee findEmployee(Integer eid) {
		return repo.findById(eid).get();
	}

}
