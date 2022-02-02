import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

public class AccountListDAOImpl implements AccountListDAO {

	public AccountListDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(AccountList account) {
		String sql = "INSERT INTO AccountList (domain, list_size, serverserver_id, serverserver_domain, "
				+ "add_accountoperation_id) "
				+ "VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, account.get_domain(), account.get_list_size(), account.get_serverserver_id(),
				account.get_serverserver_domain(), account.get_add_accountoperation_id());		
		return 0;
	}

	@Override
	public int update(AccountList account) {
		String sql = "UPDATE AccountList SET domain=?, list_size=?, serverserver_id=?, serverserver_domain=?, add_accountoperation_id=?"
				+ "WHERE id_account=?";
		return jdbcTemplate.update(sql, account.get_domain(), account.get_list_size(), account.get_serverserver_id(),
				account.get_serverserver_domain(), account.get_add_accountoperation_id());
	
	}

	@Override
	public AccountList get(Integer id) {
String sql = "SELECT * FROM AccountList WHERE id_account=" + id;
		
		ResultSetExtractor<AccountList> extractor = new ResultSetExtractor<AccountList>() {
			
			public AccountList extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					String domain = rs.getString("domain");
					int list_size = rs.getInt("list_size");
					int serverserver_id = rs.getInt("serverserver_id");
					int serverserver_domain = rs.getInt("serverserver_domain");
					int add_accountoperation_id = rs.getInt("add_accountoperation_id");

					return new AccountList(domain, list_size, serverserver_id, serverserver_domain, add_accountoperation_id);

				}
				return null;
			}
			
		};
		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM AccountList WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<AccountList> list() {
String sql = "SELECT * FROM AccountList";
		
		RowMapper<AccountList> rowMapper = new RowMapper<AccountList>() {
			
			@Override 
			public AccountList mapRow (ResultSet rs, int rowNum) throws SQLException {
				
				int id_account = rs.getInt("id_account");
				String username = rs.getString("username");
				String mail_address = rs.getString("email");
				String password = rs.getString("password");
				int account_listdomain = rs.getInt("account_listdomain");
				int voice_recordtime_domain = rs.getInt("voice_recordtime_domain");
				int voice_recordfrequency_domain = rs.getInt("voice_recordfrequency_domain");
				int voice_recordvoice_amplitude = rs.getInt("voice_recordvoice_amplitude");

				return new AccountList(id_account, username, mail_address, password, account_listdomain,voice_recordtime_domain, voice_recordfrequency_domain, voice_recordvoice_amplitude);

			}
			
		};
		
		jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}

}
