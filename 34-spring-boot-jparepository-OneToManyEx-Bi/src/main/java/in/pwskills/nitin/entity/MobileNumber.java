package in.pwskills.nitin.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OTM_MOBILE")
public class MobileNumber implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long regno;

	private Long phoneNo;

	@Column(length = 20)
	private String provider;

	@Column(length = 20)

	private String type;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pidFk", referencedColumnName = "pid")
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public MobileNumber() {
		// TODO Auto-generated constructor stub
	}

	public Long getRegno() {
		return regno;
	}

	public void setRegno(Long regno) {
		this.regno = regno;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MobileNumber(Long regno, Long phoneNo, String provider, String type) {
		this.regno = regno;
		this.phoneNo = phoneNo;
		this.provider = provider;
		this.type = type;
	}

	@Override
	public String toString() {
		return "MobileNumber [regno=" + regno + ", phoneNo=" + phoneNo + ", provider=" + provider + ", type=" + type
				+ "]";
	}

}
