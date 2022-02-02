import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

public class AccountSettingDAOImpl implements AccountSettingDAO {

	public AccountSettingDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(AccountSetting account) {
		String sql = "INSERT INTO Account (account_setting_domain, profileid, commandList, accountid_account)"
				+ "VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, account.get_account_setting_domain(), account.get_profileid(), account.get_commandList(),
				account.get_accountid_account());
		return 0;
	}

	@Override
	public int update(AccountSetting account) {
		String sql = "UPDATE Account SET account_setting_domain=?, profileid=?, commandList=?, accountid_account=?"
				+ "WHERE id_account=?";
		return jdbcTemplate.update(sql, account.get_account_setting_domain(), account.get_profileid(), account.get_commandList(),
				account.get_accountid_account());
	
	}

	@Override
	public AccountSetting get(Integer id) {
String sql = "SELECT * FROM Account WHERE id_account=" + id;
		
		ResultSetExtractor<AccountSetting> extractor = new ResultSetExtractor<Account>() {
			
			public AccountSetting extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int account_setting_domain = rs.getInt("account_setting_domain");
					int profileid = rs.getInt("profileid");
					String commandList = rs.getString("commandList");
					int accountid_account = rs.getInt("accountid_account");
					
					return new AccountSetting(account_setting_domain, profileid, commandList, accountid_account);

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
	public List<AccountSetting> list() {
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
