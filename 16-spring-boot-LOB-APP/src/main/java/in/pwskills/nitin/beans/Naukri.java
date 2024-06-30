package in.pwskills.nitin.beans;

import java.io.File;
import java.io.Serializable;

public class Naukri implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String address;
	private String name;

	private File image;
	private File resume;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public File getResume() {
		return resume;
	}

	public void setResume(File resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "Naukri [id=" + id + ", address=" + address + ", name=" + name + ", image=" + image + ", resume="
				+ resume + "]";
	}

}
