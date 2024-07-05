package in.pwskills.nitin.service;

import in.pwskills.nitin.beans.PoliticalParty;

public interface IPoliticalMgmtService {
	
	public PoliticalParty fetchPoliticalPartyDetailsByPartyId(Integer partyId);
	
}
