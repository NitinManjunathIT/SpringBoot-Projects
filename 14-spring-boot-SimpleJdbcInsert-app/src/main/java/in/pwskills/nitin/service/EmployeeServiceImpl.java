package in.pwskills.nitin.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.beans.EmployeeBO;
import in.pwskills.nitin.beans.EmployeeDTO;
import in.pwskills.nitin.dao.IEmployeeDAO;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;

	@Override
	public int registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.saveEmployee(bo);
	}

}
