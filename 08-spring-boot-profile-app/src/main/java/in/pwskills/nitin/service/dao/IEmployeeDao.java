package in.pwskills.nitin.service.dao;

import java.util.List;

import in.pwskills.nitin.beans.EmployeeBO;

public interface IEmployeeDao {
	public List<EmployeeBO>fetchEmpByDesg(String cond) throws Exception;
}
