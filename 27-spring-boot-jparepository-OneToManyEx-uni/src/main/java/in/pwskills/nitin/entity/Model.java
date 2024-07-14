package in.pwskills.nitin.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modeltab")
public class Model implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "mid")
	private Integer modelId;

	@Column(name = "mcode")
	private String modelCode;

	@Column(name = "mdata")
	private String modelData;

	public Model() {
	}

	public Model(Integer modelId, String modelCode, String modelData) {
		this.modelId = modelId;
		this.modelCode = modelCode;
		this.modelData = modelData;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelData() {
		return modelData;
	}

	public void setModelData(String modelData) {
		this.modelData = modelData;
	}

	@Override
	public String toString() {
		return "Models [modelId=" + modelId + ", modelCode=" + modelCode + ", modelData=" + modelData + "]";
	}

}
