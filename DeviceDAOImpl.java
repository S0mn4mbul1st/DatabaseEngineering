import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

public class DeviceDAOImpl implements DeviceDAO {

	public DeviceDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Device account) {
		String sql = "INSERT INTO Device (id_device, device_typeid, location, device_typeid_device, "
				+ "homeid, device_statestate_id) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, account.get_id_device(), account.get_device_typeid(), account.get_location(),
				account.get_device_typeid_device(), account.get_homeid(), account.get_device_statestate_id());	
		return 0;
	}

	@Override
	public int update(Device account) {
		String sql = "UPDATE Device SET id_device=?, device_typeid=?, location=?, device_typeid_device=?, homeid=?,"
				+ "device_statestate_id=?"
				+ "WHERE id_account=?";
		return jdbcTemplate.update(sql, account.get_id_device(), account.get_device_typeid(), account.get_location(),
				account.get_device_typeid_device(), account.get_homeid(), account.get_device_statestate_id());
	
	}

	@Override
	public Device get(Integer id) {
String sql = "SELECT * FROM Device WHERE id_account=" + id;
		
		ResultSetExtractor<Device> extractor = new ResultSetExtractor<Account>() {
			
			@Override
			public Device extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int id_device = rs.getInt("id_device");
					int device_typeid = rs.getInt("device_typeid");
					String location = rs.getString("location");
					int device_typeid_device = rs.getInt("device_typeid_device");
					int homeid = rs.getInt("homeid");
					int device_statestate_id = rs.getInt("device_statestate_id");

					return new Device(id_device, device_typeid, location, device_typeid_device, homeid,device_statestate_id);

				}
				return null;
			}
			
		};
		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM Device WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<Device> list() {
String sql = "SELECT * FROM Device";
		
		RowMapper<Account> rowMapper = new RowMapper<Account>() {
			
			@Override 
			public Account mapRow (ResultSet rs, int rowNum) throws SQLException {
				
				int id_account = rs.getInt("id_account");
				String username = rs.getString("username");
				String mail_address = rs.getString("email");
				String password = rs.getString("password");
				int account_listdomain = rs.getInt("account_listdomain");
				int voice_recordtime_domain = rs.getInt("voice_recordtime_domain");
				int voice_recordfrequency_domain = rs.getInt("voice_recordfrequency_domain");
				int voice_recordvoice_amplitude = rs.getInt("voice_recordvoice_amplitude");

				return new Account(id_account, username, mail_address, password, account_listdomain,voice_recordtime_domain, voice_recordfrequency_domain, voice_recordvoice_amplitude);

			}
			
		};
		
		jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}

}
