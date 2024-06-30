package in.pwskills.nitin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import in.pwskills.nitin.beans.EmployeeBO;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String GET_EMP_NAME_BY_NO = "select ename from employee where empNo=:eno";

	private static final String GET_EMP_BY_DESG = "select empNo,ename,job,salary,deptNo,mgrNo from employee where job in(:desg1,:desg2) order by job";

	private static final String INSERT_EMP = "insert into employee(`ename`,`job`,`salary`,`deptNo`,`mgrNo`) values(:ename,:job,:salary,:deptNo,:mgrNo)";

	@Autowired
	private NamedParameterJdbcTemplate template;

	@Override
	public String getEmpNameByEno(Integer empNo) {

		Map<String, Integer> paramMap = Map.of("eno", empNo);
		return template.queryForObject(GET_EMP_NAME_BY_NO, paramMap, String.class);
	}

	@Override
	public List<EmployeeBO> getEmployeeDetailsBasedOnDesg(String desg1, String desg2) {

		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		parameterSource.addValue("desg1", desg1);
		parameterSource.addValue("desg2", desg2);

		return template.query(GET_EMP_BY_DESG, parameterSource, new ResultSetExtractor<List<EmployeeBO>>() {

			@Override
			public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {

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

			}
		});
	}

	@Override
	public int saveEmployee(EmployeeBO bo) {
			return template.update(INSERT_EMP, new BeanPropertySqlParameterSource(bo));
	}
}
