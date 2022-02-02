import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

public class CommandDAOImpl implements CommandDAO {

	public CommandDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Command account) {
		String sql = "INSERT INTO Command (command_listcommand_names, schedulerschedule_id) "
				+ "VALUES (?, ?)";
		jdbcTemplate.update(sql, account.get_command_listcommand_names(), account.get_schedulerschedule_id());
		return 0;
	}

	@Override
	public int update(Command account) {
		String sql = "UPDATE Command SET command_listcommand_names=?, schedulerschedule_id=?"
				+ "WHERE id_account=?";
		return jdbcTemplate.update(sql, account.get_command_listcommand_names(), account.get_schedulerschedule_id());
	
	}

	@Override
	public Command get(Integer id) {
String sql = "SELECT * FROM Command WHERE id_account=" + id;
		
		ResultSetExtractor<Command> extractor = new ResultSetExtractor<Command>() {
			
			public Command extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					String command_listcommand_names = rs.getString("command_listcommand_names");
					int schedulerschedule_id = rs.getInt("schedulerschedule_id");
					
					return new Command(command_listcommand_names, schedulerschedule_id);

				}
				return null;
			}
			
		};
		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM Command WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<Command> list() {
String sql = "SELECT * FROM Command";
		
ResultSetExtractor<Command> extractor = new ResultSetExtractor<Command>() {
	
	@Override
	public Command extractData(ResultSet rs) throws SQLException, DataAccessException{
		if(rs.next()) {
			String command_listcommand_names = rs.getString("command_listcommand_names");
			int schedulerschedule_id = rs.getInt("schedulerschedule_id");
			
			return new Command(command_listcommand_names, schedulerschedule_id);

			}
			
		};
		
		jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}

}
