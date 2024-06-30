package in.pwskills.nitin.dao;

import java.util.List;

import in.pwskills.nitin.beans.ProductBO;

public interface IProductDao {
	public List<ProductBO> getProductsByName(String prod1,String prod2);
}
