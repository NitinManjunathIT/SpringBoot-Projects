package in.pwskills.nitin.beans;

public class EmployeeVO {

	private String srNo;
	private String empNo;
	private String empName;
	private String job;
	private String salary;
	private String deptNo;
	private String mgrNo;

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public void setMgrNo(String mgrNo) {
		this.mgrNo = mgrNo;
	}

	@Override
	public String toString() {
		return "EmployeeVO [srNo=" + srNo + ", empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", salary="
				+ salary + ", deptNo=" + deptNo + ", mgrNo=" + mgrNo + "]";
	}

	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}

}
