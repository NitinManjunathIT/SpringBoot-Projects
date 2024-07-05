package in.pwskills.nitin.beans;

import java.io.Serializable;

public class PoliticalParty implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer partyId;
	private String partyName;
	private String flagColors;
	private String partySymbol;

	public Integer getPartyId() {
		return partyId;
	}

	public void setPartyId(Integer partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getFlagColors() {
		return flagColors;
	}

	public void setFlagColors(String flagColors) {
		this.flagColors = flagColors;
	}

	public String getPartySymbol() {
		return partySymbol;
	}

	public void setPartySymbol(String partySymbol) {
		this.partySymbol = partySymbol;
	}

	@Override
	public String toString() {
		return "PoliticalParty [partyId=" + partyId + ", partyName=" + partyName + ", flagColors=" + flagColors
				+ ", partySymbol=" + partySymbol + "]";
	}

}
