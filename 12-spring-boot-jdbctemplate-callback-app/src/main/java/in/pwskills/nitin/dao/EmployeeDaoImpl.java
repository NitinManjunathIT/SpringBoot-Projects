package in.pwskills.nitin.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.pwskills.nitin.beans.EmployeeBO;

@Repository("dao")
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String GET_EMPLOYEE_BY_NO = "select empNo,ename,job,salary,deptNo,mgrNo from employee where empNo = ?";

	private static final String GET_EMP_BY_DESG = "select empNo,ename,job,salary,deptNo,mgrNo from employee where job in (?,?) order by job";

	private static final String GET_ALL_EMPLOYEES = "select empNo,ename,job,salary,deptNo,mgrNo from employee";

	@Autowired
	private JdbcTemplate template;

	@Override
	public EmployeeBO getEmployeeByNo(Integer empNo) {

		return template.queryForObject(GET_EMPLOYEE_BY_NO, (RowMapper<EmployeeBO>) (rs, rowNum) -> {
			System.out.println("Record pulled from the rowNum :: " + rowNum);
			// copying ResultSet object to EmployeeBO
			EmployeeBO bo = new EmployeeBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSalary(rs.getFloat(4));
			bo.setDeptNo(rs.getInt(5));
			bo.setMgrNo(rs.getInt(6));
			System.out.println("Data send from database :: " + bo);
			return bo;
		}, empNo);
	}

	@Override
	public List<EmployeeBO> getEmployeeByDesg(String desg1, String desg2) {

		return template.query(GET_EMP_BY_DESG, (ResultSetExtractor<List<EmployeeBO>>) rs -> {
			// copy from ResultSet to List<EmployeeBO>
			ArrayList<EmployeeBO> employeeBo = new ArrayList<>();
			while (rs.next()) {

				EmployeeBO bo = new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSalary(rs.getFloat(4));
				bo.setDeptNo(rs.getInt(5));
				bo.setMgrNo(rs.getInt(6));
				employeeBo.add(bo);
			}
			return employeeBo;
		}, desg1, desg2);
	}

	@Override
	public List<EmployeeBO> getAllEmployees() {

		ArrayList<EmployeeBO> employeeBo = new ArrayList<>();

		template.query(GET_ALL_EMPLOYEES, (RowCallbackHandler) rs -> {
			System.out.println("EmployeeDaoImpl.getAllEmployees().new RowCallbackHandler() {...}.processRow()");
			EmployeeBO bo = new EmployeeBO();

			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSalary(rs.getFloat(4));
			bo.setDeptNo(rs.getInt(5));
			bo.setMgrNo(rs.getInt(6));

			employeeBo.add(bo);

		});

		return employeeBo;
	}
}
