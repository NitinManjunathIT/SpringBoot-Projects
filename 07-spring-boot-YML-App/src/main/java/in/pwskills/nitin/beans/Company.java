package in.pwskills.nitin.beans;

public class Company {

	private String title;
	private String location;
	private Integer size;
	
	static {
		System.out.println("Company.class file is loading...");
	}

	public Company() {
		System.out.println("Company Object is created..");
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Company [title=" + title + ", location=" + location + ", size=" + size + "]";
	}

}
