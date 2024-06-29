package in.pwskills.nitin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String GET_EMPLOYEE_COUNT = "select count(*) from employee";
	private static final String GET_EMPLOYEE_SALARY_BY_ENO = "select salary from employee where empNo=?";
	private static final String GET_EMP_DETAILS_BY_ENO = "select * from employee where empNo =? ";
	private static final String GET_EMP_BY_DESG = "select * from employee where job in (?,?) order by job";
	private static final String INSERT_EMP_QUERY = "insert into employee(`ename`,`job`,`salary`,`deptNo`,`mgrNo`) values(?,?,?,?,?)";
	private static final String UPDATE_EMP_SALARY = "update employee set salary=? where empNo=?";
	private static final String DELETE_EMP_BY_SAL = "delete from employee where salary>=? and salary<=? ";

	
	@Autowired
	private JdbcTemplate template;

	@Override
	public int getEmployeesCount() {
		return template.queryForObject(GET_EMPLOYEE_COUNT, Integer.class);
	}

	@Override
	public float getEmployeeSalaryByEno(Integer eid) {
		return template.queryForObject(GET_EMPLOYEE_SALARY_BY_ENO, Float.class, eid);
	}

	@Override
	public Map<String, Object> getEmployeeByEno(Integer eid) {
		return template.queryForMap(GET_EMP_DETAILS_BY_ENO, eid);
	}

	@Override
	public List<Map<String, Object>> fetchEmployeeByDesg(String desg1, String desg2) {
		return template.queryForList(GET_EMP_BY_DESG, desg1,desg2);
	}

	@Override
	public int insertEmployee(String empName, String job, Float salary, Integer deptNo, Integer mgrNo) {
		return template.update(INSERT_EMP_QUERY, empName,job,salary,deptNo,mgrNo);
	}

	@Override
	public int updateEmployeeEsalary(Integer eno, Float newSalary) {
		return template.update(UPDATE_EMP_SALARY, newSalary,eno);
	}

	@Override
	public int deleteEmployeeBySalaryRange(Float startSalary, Float endSalary) {
		return template.update(DELETE_EMP_BY_SAL,startSalary,endSalary);
	}

}
