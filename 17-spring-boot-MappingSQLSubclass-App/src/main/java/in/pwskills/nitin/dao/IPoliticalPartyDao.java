package in.pwskills.nitin.dao;

import in.pwskills.nitin.beans.PoliticalParty;

public interface IPoliticalPartyDao {
	public PoliticalParty getPoliticalPartyDetailsByPartyId(Integer partyId);
}
