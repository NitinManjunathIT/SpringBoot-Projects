package in.pwskills.nitin.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

	private String name;
	private Integer eid;

	// Array Object
	private String[] nickNames;

	// List Object
	private List<String> friendsNames;

	// Set Object
	private Set<Long> phoneNumber;

	// Map Object
	private Map<String, String> bankDetails;

	// User Defined Object
	private Company company;

	public void setName(String name) {
		this.name = name;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public void setNickNames(String[] nickNames) {
		this.nickNames = nickNames;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", nickNames=" + Arrays.toString(nickNames)
				+ ", friendsNames=" + friendsNames + ", phoneNumber=" + phoneNumber + ", bankDetails=" + bankDetails
				+ ", company=" + company + "]";
	}

	public void setFriendsNames(List<String> friendsNames) {
		this.friendsNames = friendsNames;
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setBankDetails(Map<String, String> bankDetails) {
		this.bankDetails = bankDetails;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
