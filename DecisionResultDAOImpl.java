import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

public class DecisionResultDAOImpl implements DecisionResultDAO {

	public DecisionResultDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(DecisionResult account) {
		String sql = "INSERT INTO Account (id_account, username, mail_address, password, "
				+ "account_listdomain, voice_recordtime_domain, voice_recordfrequency_domain, voice_recordvoice_amplitude) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, account.get_id_account(), account.get_username(), account.get_mail_address(),
				account.get_password(), account.get_account_listdomain(), account.get_voice_recordtime_domain(),
				account.get_voice_recordfrequency_domain(), account.get_voice_recordvoice_amplitude());		return 0;
	}

	@Override
	public int update(DecisionResult account) {
		String sql = "UPDATE Account SET id_account=?, username=?, mail_address=?, password=?, account_listdomain=?,"
				+ "voice_recordtime_domain=?, voice_recordfrequency_domain=?, voice_recordvoice_amplitude=?"
				+ "WHERE id_account=?";
		return jdbcTemplate.update(sql, account.get_id_account(), account.get_username(), account.get_mail_address(),
				account.get_password(), account.get_account_listdomain(), account.get_voice_recordtime_domain(),
				account.get_voice_recordfrequency_domain(), account.get_voice_recordvoice_amplitude());
	
	}

	@Override
	public DecisionResult get(Integer id) {
String sql = "SELECT * FROM Account WHERE id_account=" + id;
		
		ResultSetExtractor<Account> extractor = new ResultSetExtractor<Account>() {
			
			@Override
			public Account extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
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
				return null;
			}
			
		};		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM Account WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<DecisionResult> list() {
String sql = "SELECT * FROM Account";
		
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
