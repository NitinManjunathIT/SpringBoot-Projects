package in.pwskills.nitin.service;

import java.util.List;

import in.pwskills.nitin.beans.EmployeeDTO;

public interface IEmployeeService {
	public String fetchEmpNameByEno(Integer empNo);
	public List<EmployeeDTO> fetchEmployeeDetailsBasedOnDesg(String desg1,String desg2);
	public int registerEmployee(EmployeeDTO dto);
}
