package in.pwskills.nitin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.pwskills.nitin.entity.Employee;
import jakarta.transaction.Transactional;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	//================select operation=============//
	@Query("FROM Employee WHERE empSal>=:esal")
	public List<Employee> fetchAllEmployees(Double esal);
	
	@Query("FROM Employee")
	public List<Employee> fetchAllEmployees();
	
	@Query("SELECT empName FROM Employee")
	public List<String> fetchNameOfEmployees();
	
	@Query("SELECT empId,empName FROM Employee")
	public List<Object[]> fetchIdAndNameofEmployee();
	
	@Query("SELECT empId,empDept FROM Employee WHERE empDept = :dep")
	public List<Object[]> fetchBasedonDept(@Param("dep")  String dept);


	//================non-select operation=============//
	@Query("DELETE FROM Employee WHERE empId=:id")
	@Modifying     //instructing the query is DML
	@Transactional //commit and rollback
	public int deleteEmployeeById(Integer id);

	@Query("UPDATE Employee SET empSal=empSal+:bonus where empId=:id")
	@Modifying
	@Transactional
	public int updateEmployeeSalaryById(Integer id,Double bonus);
	
	
}
