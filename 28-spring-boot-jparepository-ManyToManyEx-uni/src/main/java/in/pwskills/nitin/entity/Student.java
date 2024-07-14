package in.pwskills.nitin.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "stdtab")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "sid")
	private Integer stdId;

	@Column(name = "sname")
	private String stdName;

	@Column(name = "smail")
	private String stdEmail;

	@ManyToMany
	@JoinTable(name = "student_course", 
		joinColumns = @JoinColumn(name = "stdIdFk", referencedColumnName = "sid"), 
		inverseJoinColumns = @JoinColumn(name = "courseIdFk", referencedColumnName = "cid")
	    )
	private List<Course> cobs;

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdEmail() {
		return stdEmail;
	}

	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}

	public List<Course> getCobs() {
		return cobs;
	}

	public void setCobs(List<Course> cobs) {
		this.cobs = cobs;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stdId, String stdName, String stdEmail, List<Course> cobs) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdEmail = stdEmail;
		this.cobs = cobs;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdEmail=" + stdEmail + ", cobs=" + cobs + "]";
	}
}
