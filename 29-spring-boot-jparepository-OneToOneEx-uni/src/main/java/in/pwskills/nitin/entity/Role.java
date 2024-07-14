package in.pwskills.nitin.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roletab")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "rid")
	private Integer roleId;

	@Column(name = "rcode")
	private String roleCode;
	
	public Role() {

	}

	public Role(Integer roleId, String roleCode) {
		this.roleId = roleId;
		this.roleCode = roleCode;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleCode=" + roleCode + "]";
	}

}
