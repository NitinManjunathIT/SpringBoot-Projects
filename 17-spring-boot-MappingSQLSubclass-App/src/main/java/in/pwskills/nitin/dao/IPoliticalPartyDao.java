package in.pwskills.nitin.dao;

import java.util.List;

import in.pwskills.nitin.beans.PoliticalParty;

public interface IPoliticalPartyDao {
	public PoliticalParty getPoliticalPartyDetailsByPartyId(Integer partyId);
	public List<PoliticalParty> getPoliticalPartiesByNames(String partyName1,String partyName2);
	public int updateFlagColorsByPartyName(String newColor,String partyName);
}
