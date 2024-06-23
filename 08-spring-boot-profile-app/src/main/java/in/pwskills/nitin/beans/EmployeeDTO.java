package in.pwskills.nitin.beans;

public class EmployeeDTO {

	private String empName;
	private String job;
	private Integer empNo;
	private Float salary;
	private Integer deptNo;
	private Integer mgrNo;
	
	private Integer srNo;
	
	
	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	

	public Integer getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public String getJob() {
		return job;
	}

	public Float getSalary() {
		return salary;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public Integer getMgrNo() {
		return mgrNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public void setMgrNo(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empName=" + empName + ", job=" + job + ", srNo=" + srNo + ", empNo=" + empNo + ", salary="
				+ salary + ", deptNo=" + deptNo + ", mgrNo=" + mgrNo + "]";
	}

}
