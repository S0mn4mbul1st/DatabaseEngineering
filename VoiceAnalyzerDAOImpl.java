import java.util.List;

public class VoiceAnalyzerDAOImpl implements VoiceAnalyzerDAO {

	public VoiceAnalyzerDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(VoiceAnalyzer voiceAnalyzer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(VoiceAnalyzer voiceAnalyzer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public VoiceAnalyzer get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<VoiceAnalyzer> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
