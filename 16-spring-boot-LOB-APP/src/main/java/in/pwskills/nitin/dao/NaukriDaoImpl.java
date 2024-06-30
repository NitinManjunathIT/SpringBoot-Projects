package in.pwskills.nitin.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.jdbc.core.support.AbstractLobStreamingResultSetExtractor;
import org.springframework.jdbc.support.lob.LobCreator;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;
import org.springframework.util.FileCopyUtils;

import in.pwskills.nitin.beans.Naukri;

@Repository("dao")
public class NaukriDaoImpl implements INaukriDao {

	private static final String SQL_SELECT = "select * from naukri";

	@Autowired
	private LobHandler lobHandler;

	@Autowired
	private JdbcTemplate template;

	@Override
	public void saveObject(Naukri naukri) {

		int count = template.execute("INSERT INTO naukri (`address`,`image`,`name`,`resume`) VALUES (?,?,?,?)",
				new AbstractLobCreatingPreparedStatementCallback(lobHandler) {

					@Override
					protected void setValues(PreparedStatement ps, LobCreator lobCreator) throws SQLException {
						try {
							ps.setString(1, naukri.getAddress());
							ps.setString(3, naukri.getName());

							// setting lob type of data
							FileInputStream stream = new FileInputStream(naukri.getImage());
							FileReader reader = new FileReader(naukri.getResume());

							lobCreator.setBlobAsBinaryStream(ps, 2, stream, (int) naukri.getImage().length());
							lobCreator.setClobAsCharacterStream(ps, 4, reader, (int) naukri.getResume().length());

						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				});
		if (count == 0) {
			System.out.println("Insertion not possible...");
		} else {
			System.out.println("Record inserted succesfully...");
		}

	}

	@Override
	public Naukri readObject() {

		Naukri naukri = new Naukri();

		template.query(SQL_SELECT, new AbstractLobStreamingResultSetExtractor<Naukri>() {

			@Override
			protected void streamData(ResultSet rs) throws SQLException, IOException, DataAccessException {
				naukri.setId(rs.getInt(1));
				naukri.setName(rs.getString(4));
				naukri.setAddress(rs.getString(2));

				//reading image[BLOB] from db and writing to our harddisk
				File imageFile = new File("nitin.jpg");
				FileOutputStream stream = new FileOutputStream(imageFile);
				FileCopyUtils.copy(lobHandler.getBlobAsBinaryStream(rs, 3), stream);
				naukri.setImage(imageFile);
				
				
				//reading resume[CLOB] from db and writing to our harddisk
				File resumeFile = new File("nitin.txt");
				FileWriter writer = new FileWriter(resumeFile);
				FileCopyUtils.copy(lobHandler.getClobAsCharacterStream(rs, 5), writer);
				naukri.setResume(resumeFile);

			}

		});
		return naukri;

	}

}
