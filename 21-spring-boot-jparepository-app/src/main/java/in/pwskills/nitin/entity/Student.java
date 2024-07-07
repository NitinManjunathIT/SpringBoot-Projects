package in.pwskills.nitin.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "stdtab")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "sid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stdId;

	@Column(name = "sname")
	private String stdName;

	@Column(name = "sfee")
	private Double stdFee;

	@Column(name = "sdoj")
	// @Temporal(TemporalType.DATE)//stores only date
	// @Temporal(TemporalType.TIME)//stores only time
	@Temporal(TemporalType.TIMESTAMP) // stores both and time (default)
	private Date stdDoj;

	public Student() {

	}

	public Student(String stdName, Double stdFee, Date stdDoj) {
		this.stdName = stdName;
		this.stdFee = stdFee;
		this.stdDoj = stdDoj;
	}

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

	public Double getStdFee() {
		return stdFee;
	}

	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}

	public Date getStdDoj() {
		return stdDoj;
	}

	public void setStdDoj(Date stdDoj) {
		this.stdDoj = stdDoj;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + ", stdDoj=" + stdDoj + "]";
	}

}
