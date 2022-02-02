import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

public class LogSharingDAOImpl implements LogSharingDAO {

	public LogSharingDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(LogSharing account) {
		String sql = "INSERT INTO LogSharing (id, shared_id, user_accountsid, user_accountsusername, "
				+ "profileid, account_listdomain, logprofileid"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, account.get_id(), account.get_shared_id(), account.get_user_accountsid(),
				account.get_user_accountsusername(), account.get_profileid(), account.get_account_listdomain(),
				account.get_logprofileid());		
		return 0;
	}

	@Override
	public int update(LogSharing account) {
		String sql = "UPDATE LogSharing SET id=?, shared_id=?, user_accountsid=?, user_accountsusername=?, profileid=?,"
				+ "account_listdomain=?, logprofileid=?"
				+ "WHERE id_account=?";
		return jdbcTemplate.update(sql, account.get_id(), account.get_shared_id(), account.get_user_accountsid(),
				account.get_user_accountsusername(), account.get_profileid(), account.get_account_listdomain(),
				account.get_logprofileid());
	
	}

	@Override
	public LogSharing get(Integer id) {
String sql = "SELECT * FROM LogSharing WHERE id_account=" + id;
		
		ResultSetExtractor<LogSharing> extractor = new ResultSetExtractor<LogSharing>() {
			
			public LogSharing extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					int id = rs.getInt("id");
					int shared_id = rs.getInt("shared_id");
					int user_accountsid = rs.getInt("user_accountsid");
					String user_accountsusername = rs.getString("user_accountsusername");
					int profileid = rs.getInt("profileid");
					int account_listdomain = rs.getInt("account_listdomain");
					int logprofileid = rs.getInt("logprofileid");

					return new LogSharing(id, shared_id, user_accountsid, user_accountsusername,profileid, account_listdomain, logprofileid);

				}
				return null;
			}
			
		};		
		return null;
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM LogSharing WHERE id_account=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<LogSharing> list() {
String sql = "SELECT * FROM LogSharing";
		
		RowMapper<LogSharing> rowMapper = new RowMapper<LogSharing>() {
			
			@Override 
			public LogSharing mapRow (ResultSet rs, int rowNum) throws SQLException {
				
				int id = rs.getInt("id");
				int shared_id = rs.getInt("shared_id");
				int user_accountsid = rs.getInt("user_accountsid");
				String user_accountsusername = rs.getString("user_accountsusername");
				int profileid = rs.getInt("profileid");
				int account_listdomain = rs.getInt("account_listdomain");
				int logprofileid = rs.getInt("logprofileid");

				return new LogSharing(id, shared_id, user_accountsid, user_accountsusername,profileid, account_listdomain, logprofileid);

			}
			
		};
		
		jdbcTemplate.query(sql, rowMapper);
		
		return null;
	}

}
