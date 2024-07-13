package in.pwskills.nitin.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "prodTab")
public class Product {

	@Id
	@Column(name = "pid")
	private Integer prodId;

	@Column(name = "pcode")
	private String prodCode;

	@ElementCollection
	@CollectionTable(name = "product_colors", joinColumns = @JoinColumn(name = "pidFk"))
	@OrderColumn(name = "pos") // index column[list]
	@Column(name = "data") // actual color data
	private List<String> colors;

	@ElementCollection
	@CollectionTable(name = "product_models", joinColumns = @JoinColumn(name = "pidF"))
	@Column(name = "model")
	private Set<String> models;

	@ElementCollection
	@CollectionTable(name = "product_details", joinColumns = @JoinColumn(name = "pidF"))
	@MapKeyColumn(name = "code") // key column(Map)
	@Column(name = "details") // actual details of product
	private Map<String, String> details;

	public Product() {

	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

}
