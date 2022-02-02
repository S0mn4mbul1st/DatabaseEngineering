import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

public class HomeDAOImpl implements HomeDAO {

	public HomeDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Home account) {
		String sql = "INSERT INTO Home (id, address, tenants)"
				+ "VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, account.get_id(), account.get_address(), account.get_tenants());	
		return 0;
	}

	@Override
	public int update(Home account) {
		String sql = "UPDATE Home SET id=?, address=?, tenants=?"
				+ "WHERE id_account=?";
		return jdbcTemplate.update(sql, account.get_id(), account.get_address(), account.get_tenants());
	
	}

	@Override
	public Home get(Integer id) {
String sql = "SELECT * FROM Home WHERE id_account=" + id;
		
		ResultSetExtractor<Home> extractor = new ResultSetExtractor<Home>() {
			
			public Home extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int id = rs.getInt("id");
					String address = rs.getString("address");
					String tenants = rs.getString("tenants");
			
					return new Home(id, address, tenants);

				}
				return null;
			}
			
		};
		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM Home WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<Home> list() {
String sql = "SELECT * FROM Home";
		
		RowMapper<Home> rowMapper = new RowMapper<Home>() {
			
			@Override 
			public Home mapRow (ResultSet rs, int rowNum) throws SQLException {
				
				int id = rs.getInt("id");
				String address = rs.getString("address");
				String tenants = rs.getString("tenants");

				return new Home(id, address, tenants);

			}
			
		};
		
		jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}

}
