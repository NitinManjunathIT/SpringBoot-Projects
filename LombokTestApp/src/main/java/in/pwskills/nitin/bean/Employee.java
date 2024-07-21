package in.pwskills.nitin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@NonNull
	private Integer eid;
	@NonNull	
	private String ename;
	@NonNull
	private String eaddress;
	
	private Float esalary;
}
