package in.pwskills.nitin.service;

import java.util.List;

import in.pwskills.nitin.beans.EmployeeDTO;

public interface IEmployeeService {
	public EmployeeDTO fetchEmployeeByNo(Integer empNo);
	public List<EmployeeDTO> fetchEmployeeByDesg(String desg1,String desg2);
	public List<EmployeeDTO> fetchAllEmployees();
}
