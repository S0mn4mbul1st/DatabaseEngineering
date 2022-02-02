import java.util.List;

public class VoiceRecordDAOImpl implements VoiceRecordDAO {

	public VoiceRecordDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(VoiceRecord voiceRecord) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(VoiceRecord voiceRecord) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public VoiceRecord get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<VoiceRecord> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
