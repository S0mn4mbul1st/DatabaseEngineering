import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

public class DeviceTypeDAOImpl implements DeviceTypeDAO {

	public DeviceTypeDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(DeviceType account) {
		String sql = "INSERT INTO DeviceType (device_type_id, type, mail_address, password, "
				+ "account_listdomain, voice_recordtime_domain, voice_recordfrequency_domain, voice_recordvoice_amplitude) "
				+ "VALUES (?, ?)";
		jdbcTemplate.update(sql, account.get_device_type_id(), account.get_type());		return 0;
	}

	@Override
	public int update(DeviceType account) {
		String sql = "UPDATE DeviceType SET device_type_id=?, type=?"
				+ "WHERE id_account=?";
		return jdbcTemplate.update(sql, account.get_device_type_id(), account.get_type());
	
	}

	@Override
	public DeviceType get(Integer id) {
String sql = "SELECT * FROM DeviceType WHERE id_account=" + id;
		
		ResultSetExtractor<DeviceType> extractor = new ResultSetExtractor<DeviceType>() {
			
			@Override
			public DeviceType extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int device_type_id = rs.getInt("device_type_id");
					String type = rs.getString("type");

					return new DeviceType(device_type_id, type);

				}
				return null;
			}
			
		};
		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM DeviceType WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<DeviceType> list() {
String sql = "SELECT * FROM DeviceType";
		
		RowMapper<DeviceType> rowMapper = new RowMapper<Account>() {
			
			@Override 
			public DeviceType mapRow (ResultSet rs, int rowNum) throws SQLException {
				
				int device_type_id = rs.getInt("device_type_id");
				String type = rs.getString("type");
				
				return new DeviceType(device_type_id, type);

			}
			
		};
		
		jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}

}
