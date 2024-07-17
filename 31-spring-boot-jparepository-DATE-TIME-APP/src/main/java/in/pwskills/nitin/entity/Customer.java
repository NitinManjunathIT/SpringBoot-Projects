package in.pwskills.nitin.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "custtab")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer custId;

	@Column(length = 20)
	private String custName;

	@Column(length = 20)
	private String custAddrs;

	private LocalDateTime dob;

	private LocalTime top;

	private LocalDate dop;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddrs() {
		return custAddrs;
	}

	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public LocalTime getTop() {
		return top;
	}

	public void setTop(LocalTime top) {
		this.top = top;
	}

	public LocalDate getDop() {
		return dop;
	}

	public void setDop(LocalDate dop) {
		this.dop = dop;
	}

	public Customer(Integer custId, String custName, String custAddrs, LocalDateTime dob, LocalTime top,
			LocalDate dop) {
		this.custId = custId;
		this.custName = custName;
		this.custAddrs = custAddrs;
		this.dob = dob;
		this.top = top;
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddrs=" + custAddrs + ", dob=" + dob
				+ ", top=" + top + ", dop=" + dop + "]";
	}

}
