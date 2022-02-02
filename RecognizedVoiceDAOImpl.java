import java.util.List;

public class RecognizedVoiceDAOImpl implements RecognizedVoiceDAO {

	public RecognizedVoiceDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(RecognizedVoice account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RecognizedVoice account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RecognizedVoice get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RecognizedVoice> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
