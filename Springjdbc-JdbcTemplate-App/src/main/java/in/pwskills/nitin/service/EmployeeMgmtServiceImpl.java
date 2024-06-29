package in.pwskills.nitin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.dao.IEmployeeDao;

@Service("service")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDao dao;

	@Override
	public int fetchEmpCount() {
		return dao.getEmployeesCount();
	}

	@Override
	public float fetchEmployeeSalaryByEno(Integer eid) {
		return dao.getEmployeeSalaryByEno(eid);
	}

	@Override
	public Map<String, Object> fetchEmployeeByEno(Integer eid) {
		return dao.getEmployeeByEno(eid);
	}

	@Override
	public List<Map<String, Object>> fetchEmployeeByDesg(String desg1, String desg2) {
		return dao.fetchEmployeeByDesg(desg1, desg2);
	}

	@Override
	public int registerEmployee(String empName, String job, Float salary, Integer deptNo, Integer mgrNo) {
		return dao.insertEmployee(empName, job, salary, deptNo, mgrNo);
	}

	@Override
	public int hikeEmployeeEsalary(Integer eno, Float newSalary) {
		return dao.updateEmployeeEsalary(eno, newSalary);
	}

	@Override
	public int fireEmployeeBySalaryRange(Float startSalary, Float endSalary) {
		return dao.deleteEmployeeBySalaryRange(startSalary, endSalary);
	}

}
