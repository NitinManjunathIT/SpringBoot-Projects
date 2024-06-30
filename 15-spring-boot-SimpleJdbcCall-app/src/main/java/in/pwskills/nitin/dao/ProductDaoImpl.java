package in.pwskills.nitin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import in.pwskills.nitin.beans.ProductBO;

/*
 * 
DROP PROCEDURE IF EXISTS `GET_PRODUCT_DETAILS_BY_NAME`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GET_PRODUCT_DETAILS_BY_NAME`(
			IN name1 VARCHAR(20),
			IN name2 VARCHAR(20))
BEGIN
	   SELECT pid,pname,price,quantity
	       FROM
	          products
	            WHERE pname IN (name1,name2);

	END$$

DELIMITER ;
 * 
 * 
 * 
 */
@Repository("dao")
public class ProductDaoImpl implements IProductDao {

	@Autowired
	private SimpleJdbcCall jdbcCall;

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductBO> getProductsByName(String prod1, String prod2) {

		// set procedure name
		jdbcCall.setProcedureName("GET_PRODUCT_DETAILS_BY_NAME");
		
		//setting the inputs to storedprocedure
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		parameterSource.addValue("name1", prod1);
		parameterSource.addValue("name2", prod2);

		//keeping the result
		jdbcCall.returningResultSet("result", new RowMapper<ProductBO>() {

			@Override
			public ProductBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				System.out.println(rowNum);
				ProductBO bo = new ProductBO();
				bo.setPid(rs.getInt(1));
				bo.setPname(rs.getString(2));
				bo.setPrice(rs.getFloat(3));
				bo.setQty(rs.getInt(3));
				return bo;
			}
		});

		Map<String, Object> output = jdbcCall.execute(parameterSource);
		List<ProductBO> listBo = (List<ProductBO>) output.get("result");

		return listBo;
	}

}
