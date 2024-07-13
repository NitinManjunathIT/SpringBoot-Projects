package in.pwskills.nitin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.pwskills.nitin.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("FROM Employee WHERE empSal>=:esal")
	public List<Employee> fetchAllEmployees(Double esal);
	
	@Query("SELECT empName FROM Employee")
	public List<String> fetchNameOfEmployees();
	
	@Query("SELECT empId,empName FROM Employee")
	public List<Object[]> fetchIdAndNameofEmployee();
	
	@Query("SELECT empId,empDept FROM Employee WHERE empDept = :dep")
	public List<Object[]> fetchBasedonDept(@Param("dep")  String dept);
}
