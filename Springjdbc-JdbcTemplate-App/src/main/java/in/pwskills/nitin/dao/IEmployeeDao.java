package in.pwskills.nitin.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {
	public int getEmployeesCount();
	public float getEmployeeSalaryByEno(Integer eid);
	public Map<String,Object> getEmployeeByEno(Integer eid);
	public List<Map<String,Object>> fetchEmployeeByDesg(String desg1,String desg2);
	
	public int insertEmployee(String empName,String job,Float salary,Integer deptNo,Integer mgrNo);
	public int updateEmployeeEsalary(Integer eno,Float newSalary);
	public int deleteEmployeeBySalaryRange(Float startSalary,Float endSalary);
}
