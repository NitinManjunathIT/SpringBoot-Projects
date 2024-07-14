package in.pwskills.nitin.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "depttab")
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "did")
	private Integer deptId;

	@Column(name = "dname")
	private String deptName;

	@Column(name = "dadmin")
	private String deptAdmin;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	//constructor for initialization
	public Department(Integer deptId, String deptName, String deptAdmin) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAdmin = deptAdmin;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAdmin() {
		return deptAdmin;
	}

	public void setDeptAdmin(String deptAdmin) {
		this.deptAdmin = deptAdmin;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptAdmin=" + deptAdmin + "]";
	}

}
