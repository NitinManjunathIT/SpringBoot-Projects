package in.pwskills.nitin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Repository;

import in.pwskills.nitin.beans.PoliticalParty;

@Repository("dao")
public class PoliticalPartyDaoImpl implements IPoliticalPartyDao {

	private static final String GET_PARTY_DETAILS_BY_ID = "select partyId,flagcolors,partyName,partySymbol from politicalParty where partyId=?";

	private PoliticalPartySelector1 selector1;

	@Autowired
	public PoliticalPartyDaoImpl(DataSource ds) {
		System.out.println("PoliticalPartyDaoImpl.PoliticalPartyDaoImpl()");
		selector1 = new PoliticalPartySelector1(ds, GET_PARTY_DETAILS_BY_ID);
	}

	@Override
	public PoliticalParty getPoliticalPartyDetailsByPartyId(Integer partyId) {
		return selector1.findObject(partyId);
	}

	// ================================================================================
	// static nested class
	private static class PoliticalPartySelector1 extends MappingSqlQuery<PoliticalParty> {

		public PoliticalPartySelector1(DataSource ds, String query) {
			super(ds, query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}

		@Override
		public PoliticalParty mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("PoliticalPartyDaoImpl.PoliticalPartySelector1.mapRow()");
			// converting RS object to Model class object
			PoliticalParty party = new PoliticalParty();
			party.setPartyId(rs.getInt(1));
			party.setPartyName(rs.getString(3));
			party.setFlagColors(rs.getString(2));
			party.setPartySymbol(rs.getString(4));
			return party;
		}
	}

}
