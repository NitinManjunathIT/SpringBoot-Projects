package in.pwskills.nitin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import in.pwskills.nitin.beans.PoliticalParty;

@Repository("dao")
public class PoliticalPartyDaoImpl implements IPoliticalPartyDao {

	private static final String GET_PARTY_DETAILS_BY_ID = "select partyId,flagcolors,partyName,partySymbol from politicalParty where partyId=?";
	private static final String GET_PARTY_DETAILS_BY_NAMES = "select partyId,flagcolors,partyName,partySymbol from politicalParty where partyName in (?,?)";
	private static final String UPDATE_PARTY_FLAG_COLOR_BY_NAME = "update politicalParty set flagcolors = ? where partyName = ?";

	private PoliticalPartySelector1 selector1;
	private PoliticalPartySelector2 selector2;
	private PoliticalPartyUpdater updator;

	@Autowired
	public PoliticalPartyDaoImpl(DataSource ds) {
		System.out.println("PoliticalPartyDaoImpl.PoliticalPartyDaoImpl()");
		selector1 = new PoliticalPartySelector1(ds, GET_PARTY_DETAILS_BY_ID);
		selector2 = new PoliticalPartySelector2(ds, GET_PARTY_DETAILS_BY_NAMES);
		updator = new PoliticalPartyUpdater(ds,UPDATE_PARTY_FLAG_COLOR_BY_NAME);
	}

	@Override
	public PoliticalParty getPoliticalPartyDetailsByPartyId(Integer partyId) {
		return selector1.findObject(partyId);
	}
	
	@Override
	public List<PoliticalParty> getPoliticalPartiesByNames(String partyName1, String partyName2) {
		return selector2.execute(partyName1,partyName2);
	}
	
	@Override
	public int updateFlagColorsByPartyName(String newColor, String partyName) {
		return updator.update(newColor,partyName);
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
	
	private static class PoliticalPartySelector2 extends MappingSqlQuery<PoliticalParty> {

		public PoliticalPartySelector2(DataSource ds, String query) {
			super(ds, query);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.VARCHAR));
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

	//inner class for update query
	private static class PoliticalPartyUpdater extends SqlUpdate{
		
		public PoliticalPartyUpdater(DataSource ds, String query) {
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.compile();
		}
	}
	
}
