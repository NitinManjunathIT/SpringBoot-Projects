package in.pwskills.nitin.service;

import java.util.List;

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

	@Override
	public List<PoliticalParty> fetchPoliticalPartiesByNames(String partyName1, String partyName2) {
		return dao.getPoliticalPartiesByNames("congress", "bjp");
	}

	@Override
	public int modifyFlagColorsByPartyName(String newColor, String partyName) {
		return dao.updateFlagColorsByPartyName(newColor, partyName);
	}

}
