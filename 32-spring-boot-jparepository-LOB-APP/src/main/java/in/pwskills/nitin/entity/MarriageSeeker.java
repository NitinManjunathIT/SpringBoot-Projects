package in.pwskills.nitin.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class MarriageSeeker implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 20)
	private String name;

	@Column(length = 20)
	private String addrs;

	private LocalDateTime dob;

	@Lob
	@Column(length = 100000)
	private byte[] photo;

	@Lob
	private char[] biodata;

	private boolean indian;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public char[] getBiodata() {
		return biodata;
	}

	public void setBiodata(char[] biodata) {
		this.biodata = biodata;
	}

	public boolean isIndian() {
		return indian;
	}

	public void setIndian(boolean indian) {
		this.indian = indian;
	}

	public MarriageSeeker() {
		// TODO Auto-generated constructor stub
	}

	public MarriageSeeker(String name, String addrs, LocalDateTime dob, byte[] photo, char[] biodata,
			boolean indian) {
		this.name = name;
		this.addrs = addrs;
		this.dob = dob;
		this.photo = photo;
		this.biodata = biodata;
		this.indian = indian;
	}

	@Override
	public String toString() {
		return "MarriageSeeker [id=" + id + ", name=" + name + ", addrs=" + addrs + ", dob=" + dob + ", indian="
				+ indian + "]";
	}

}
