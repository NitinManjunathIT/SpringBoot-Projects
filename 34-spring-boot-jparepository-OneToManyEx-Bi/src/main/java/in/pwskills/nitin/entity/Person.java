package in.pwskills.nitin.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "OTM_BI_PERSON")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer pid;

	@Column(length = 20)
	private String pname;

	@Column(length = 20)
	private String paddrs;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "person")
	private Set<MobileNumber> mobile;

	public Set<MobileNumber> getMobile() {
		return mobile;
	}

	public void setMobile(Set<MobileNumber> mobile) {
		this.mobile = mobile;
	}

	public Person(Integer pid, String pname, String paddrs) {
		this.pid = pid;
		this.pname = pname;
		this.paddrs = paddrs;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddrs() {
		return paddrs;
	}

	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "]";
	}

}
