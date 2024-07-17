package in.pwskills.nitin.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertab")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "uid")
	private Integer userId;

	@Column(name = "uname")
	private String userName;

	@ManyToOne
	@JoinColumn(name = "roleIdFk", 
	   referencedColumnName = "rid", unique = true)
	private Role rob;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String userName, Role rob) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.rob = rob;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Role getRob() {
		return rob;
	}

	public void setRob(Role rob) {
		this.rob = rob;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", rob=" + rob + "]";
	}

}
