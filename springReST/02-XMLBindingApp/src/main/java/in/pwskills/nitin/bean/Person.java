package in.pwskills.nitin.bean;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Person {
	private Integer id;
	private String name;
	private String email;
	private String gender;
}
