import java.util.List;

public class ServerDAOImpl implements ServerDAO {

	public ServerDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Server server) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Server server) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Server get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Server> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
