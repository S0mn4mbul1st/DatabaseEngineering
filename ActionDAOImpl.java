import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

public class ActionDAOImpl implements ActionDAO {

	public ActionDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Action account) {
		String sql = "INSERT INTO Account (transaction_id, channel, isPossible, logprofileid, "
				+ "command_listcommand_names, alertalert_id) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, account.get_transaction_id(), account.get_channel(), account.get_isPossible(),
				account.get_logprofileid(), account.get_command_listcommand_names(), account.get_alertalert_id());	
		return 0;
	}

	@Override
	public int update(Action account) {
		String sql = "UPDATE Account SET transaction_id=?, channel=?, isPossible=?, logprofileid=?, command_listcommand_names=?,"
				+ "alertalert_id=?";
		return jdbcTemplate.update(sql, account.get_transaction_id(), account.get_channel(), account.get_isPossible(),
				account.get_logprofileid(), account.get_command_listcommand_names(), account.get_alertalert_id());
	
	}

	@Override
	public Action get(Integer id) {
		String sql = "SELECT * FROM Account WHERE id_account=" + id;
		
		ResultSetExtractor<Action> extractor = new ResultSetExtractor<Account>() {
			
			@Override
			public Action extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int transaction_id = rs.getInt("transaction_id");
					String channel = rs.getString("channel");
					int isPossible = rs.getInt("isPossible");
					int logprofileid = rs.getInt("logprofileid");
					String command_listcommand_names = rs.getString("command_listcommand_names");
					int alertalert_id = rs.getInt("alertalert_id");
					
					return new Action(transaction_id, channel, isPossible, logprofileid, command_listcommand_names, alertalert_id);

				}
				return null;
			}
			
		};
		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM Account WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<Action> list() {
		String sql = "SELECT * FROM Account";
		
		RowMapper<Action> rowMapper = new RowMapper<Account>() {
			
			@Override 
			public Action mapRow (ResultSet rs, int rowNum) throws SQLException {
				
				int id_account = rs.getInt("id_account");
				String username = rs.getString("username");
				String mail_address = rs.getString("email");
				String password = rs.getString("password");
				int account_listdomain = rs.getInt("account_listdomain");
				int voice_recordtime_domain = rs.getInt("voice_recordtime_domain");
				int voice_recordfrequency_domain = rs.getInt("voice_recordfrequency_domain");
				int voice_recordvoice_amplitude = rs.getInt("voice_recordvoice_amplitude");

				return new Action(id_account, username, mail_address, password, account_listdomain,voice_recordtime_domain, voice_recordfrequency_domain, voice_recordvoice_amplitude);

			}
			
		};
		
		jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}

}
