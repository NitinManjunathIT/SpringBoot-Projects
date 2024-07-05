package in.pwskills.nitin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.beans.PoliticalParty;
import in.pwskills.nitin.dao.IPoliticalPartyDao;

@Service("service")
public class PoliticalMgmtServiceImpl implements IPoliticalMgmtService {

	@Autowired
	private IPoliticalPartyDao dao;
	
	@Override
	public PoliticalParty fetchPoliticalPartyDetailsByPartyId(Integer partyId) {
		return dao.getPoliticalPartyDetailsByPartyId(partyId);
	}

}
