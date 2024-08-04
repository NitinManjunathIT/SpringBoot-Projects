package in.pwskills.nitin.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	//HAS-A
	private Address address;
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	@JsonIgnore
	private boolean active;
	
	
	private List<String> friendsName;
	
	
}
