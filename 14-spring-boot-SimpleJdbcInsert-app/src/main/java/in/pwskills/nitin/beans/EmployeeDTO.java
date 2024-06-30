package in.pwskills.nitin.beans;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer empNo;
	private String ename;
	private String job;
	private Float salary;

	public EmployeeDTO() {
		
	}

	public EmployeeDTO(String ename, String job, Float salary, Integer deptNo, Integer mgrNo) {
		this.ename = ename;
		this.job = job;
		this.salary = salary;
		this.deptNo = deptNo;
		this.mgrNo = mgrNo;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Integer getMgrNo() {
		return mgrNo;
	}

	public void setMgrNo(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}

	private Integer deptNo;
	private Integer mgrNo;

	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", deptNo="
				+ deptNo + ", mgrNo=" + mgrNo + "]";
	}
}
