import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

public class CommandListDAOImpl implements CommandListDAO {

	public CommandListDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(CommandList account) {
		String sql = "INSERT INTO CommandList (command_names, device_typeid, type, time, "
				+ "device_typeid_device) "
				+ "VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, account.get_command_names(), account.get_device_typeid(), account.get_type(),
				account.get_type(), account.get_time(), account.get_device_typeid_device());
		return 0;
	}

	@Override
	public int update(CommandList account) {
		String sql = "UPDATE CommandList SET command_names=?, device_typeid=?, type=?, time=?, device_typeid_device=?";
		
		return jdbcTemplate.update(sql, account.get_command_names(), account.get_device_typeid(), account.get_type(),
				account.get_type(), account.get_time(), account.get_device_typeid_device());
	
	}

	@Override
	public CommandList get(Integer id) {
String sql = "SELECT * FROM CommandList WHERE id_account=" + id;
		
		ResultSetExtractor<CommandList> extractor = new ResultSetExtractor<CommandList>() {
			
			
			public CommandList extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					String command_names = rs.getString("command_names");
					int device_typeid = rs.getInt("device_typeid");
					String type = rs.getString("type");
					int time = rs.getInt("time");
					int device_typeid_device = rs.getInt("device_typeid_device");
					
					return new CommandList(command_names, device_typeid, type, password, time, device_typeid_device);

				}
				return null;
			}
			
		};
		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM CommandList WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<CommandList> list() {
String sql = "SELECT * FROM CommandList";
		
		RowMapper<CommandList> rowMapper = new RowMapper<CommandList>() {
			
			@Override 
			public CommandList mapRow (ResultSet rs, int rowNum) throws SQLException {
				
				String command_names = rs.getString("command_names");
				int device_typeid = rs.getInt("device_typeid");
				String type = rs.getString("type");
				int time = rs.getInt("time");
				int device_typeid_device = rs.getInt("device_typeid_device");
				
				return new CommandList(command_names, device_typeid, type, password, time, device_typeid_device);

			}
			
		};
		
		jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}

}
