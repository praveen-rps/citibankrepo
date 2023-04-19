package springjdbcdemo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SalesMapper implements RowMapper<SalesTable> {

	public SalesTable mapRow(ResultSet rs, int n) throws SQLException {
		// TODO Auto-generated method stub
		SalesTable t= new SalesTable();
		t.setEname(rs.getString(1));
		t.setJob(rs.getString(2));
		t.setSal(rs.getInt(3));
		return t;
	}

}
