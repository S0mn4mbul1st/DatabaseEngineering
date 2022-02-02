import java.util.List;

public class SecurityDAOImpl implements SecurityDAO {

	public SecurityDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Security security) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Security security) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Security get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Security> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
