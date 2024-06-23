package in.pwskills.nitin.service;

import java.util.List;

import in.pwskills.nitin.beans.EmployeeDTO;

public interface IEmployeeMgmtService {
	public List<EmployeeDTO>fetchEmpByDesg(String desg[]) throws Exception;
}
