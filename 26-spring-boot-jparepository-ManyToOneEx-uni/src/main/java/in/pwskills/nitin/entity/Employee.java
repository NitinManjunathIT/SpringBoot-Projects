package in.pwskills.nitin.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "emptab")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "eid")
	private Integer empId;

	@Column(name = "ename")
	private String empName;

	@Column(name = "esal")
	private Double empSal;

	// ManyToOne
	@ManyToOne
	@JoinColumn(name = "deptIdFk",
			referencedColumnName = "did")
	private Department dept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//constructor for initialization
	public Employee(Integer empId, String empName, Double empSal, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dept = dept;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", dept=" + dept + "]";
	}

	

}
