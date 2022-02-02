import java.util.List;

public class SchedulerDAOImpl implements SchedulerDAO {

	public SchedulerDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Scheduler scheduler) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Scheduler scheduler) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Scheduler get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Scheduler> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
