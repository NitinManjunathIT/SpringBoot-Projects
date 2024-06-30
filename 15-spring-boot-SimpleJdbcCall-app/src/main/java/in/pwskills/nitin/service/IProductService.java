package in.pwskills.nitin.service;

import java.util.List;

import in.pwskills.nitin.beans.ProductDTO;

public interface IProductService {
	public List<ProductDTO> fetchProductsByName(String prod1,String prod2);
}
