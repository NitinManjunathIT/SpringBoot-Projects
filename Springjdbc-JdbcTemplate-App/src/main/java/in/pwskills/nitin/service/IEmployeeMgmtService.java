package in.pwskills.nitin.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeMgmtService {
	public int fetchEmpCount();
	public float fetchEmployeeSalaryByEno(Integer eid);
	public Map<String, Object> fetchEmployeeByEno(Integer eid);
	public List<Map<String,Object>> fetchEmployeeByDesg(String desg1,String desg2);
	
	
	public int registerEmployee(String empName,String job,Float salary,Integer deptNo,Integer mgrNo);
	public int hikeEmployeeEsalary(Integer eno,Float newSalary);
	public int fireEmployeeBySalaryRange(Float startSalary,Float endSalary);
}
