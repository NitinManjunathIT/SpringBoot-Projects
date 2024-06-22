package in.pwskills.nitin.beans;

public class EmployeeBO {

	private String empName;
	private String job;
	private Integer empNo;
	private Float salary;
	private Integer deptNo;
	private Integer mgrNo;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
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

	@Override
	public String toString() {
		return "EmployeeBO [empName=" + empName + ", job=" + job + ", empNo=" + empNo + ", salary=" + salary
				+ ", deptNo=" + deptNo + ", mgrNo=" + mgrNo + "]";
	}

}
