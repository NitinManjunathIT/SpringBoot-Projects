package in.pwskills.nitin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.pwskills.nitin.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e.empName,d.deptName FROM Employee e INNER JOIN e.dob d")
	public List<Object[]> getEnameDeptNames();
	
	@Query("SELECT e.empName,d.deptName FROM Employee e LEFT JOIN e.dob d")
	public List<Object[]> getAllEnamesAndDeptNamesIfExist();
	
	@Query("SELECT e.empName,d.deptName FROM Employee e RIGHT JOIN e.dob d")
	public List<Object[]> getAllDeptsAndEnamesIfExist();
	
	@Query("SELECT e.empName,d.deptName FROM Employee e LEFT JOIN e.dob d WHERE d.deptId IS NULL")
	public List<Object[]> getAllEnamesAndDeptNamesIsNull();
	
	@Query("SELECT e.empName,d.deptName FROM Employee e RIGHT JOIN e.dob d WHERE e.empId IS NULL")
	public List<Object[]> getDeptNamesAndEmployeeIsNull();
	
	
	@Query("SELECT e.empName,d.deptName FROM Employee e INNER JOIN e.dob d where d.deptName=:deptName")
	public List<Object[]> getEmployeesOfParticularDepartment(String deptName);
}
