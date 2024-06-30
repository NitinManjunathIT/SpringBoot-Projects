package in.pwskills.nitin.beans;

public class ProductBO {
	private Integer pid;
	private String pname;
	private Integer qty;
	private Float price;

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

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductBO [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
	}

}
