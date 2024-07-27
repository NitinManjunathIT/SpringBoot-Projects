package in.pwskills.nitin.bean;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer empId;
	private String empName;
	private Double empSal;

	private String empPwd;
	private String empDept;
	private String empAddr;

	public Employee() {
		System.out.println("Employee:: Zero param constructor...");

	}

	public Integer getEmpId() {
		System.out.println("Employee.getEmpId()");
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
		System.out.println("Employee.setEmpId()");
	}

	public String getEmpName() {
		System.out.println("Employee.getEmpName()");
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
		System.out.println("Employee.setEmpName()");
	}

	public Double getEmpSal() {
		System.out.println("Employee.getEmpSal()");
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
		System.out.println("Employee.setEmpSal()");
	}

	public String getEmpPwd() {
		System.out.println("Employee.getEmpPwd()");
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public String getEmpDept() {
		System.out.println("Employee.getEmpDept()");
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
		System.out.println("Employee.setEmpDept()");
	}

	public String getEmpAddr() {
		System.out.println("Employee.getEmpAddr()");
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
		System.out.println("Employee.setEmpAddr()");
	}

	@Override
	public String toString() {
		System.out.println("Employee.toString()");
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empPwd=" + empPwd
				+ ", empDept=" + empDept + ", empAddr=" + empAddr + "]";
	}

}
