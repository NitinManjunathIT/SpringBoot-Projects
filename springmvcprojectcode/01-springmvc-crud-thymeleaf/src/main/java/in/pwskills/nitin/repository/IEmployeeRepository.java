package in.pwskills.nitin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.nitin.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
}
