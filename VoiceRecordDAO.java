import java.util.List;

public interface VoiceRecordDAO {
	public int save(VoiceRecord voiceRecord);
	
	
	public int update(VoiceRecord voiceRecord);

	
	public VoiceRecord get(Integer id);

	
	public int delete(Integer id);

	
	public List<VoiceRecord> list();

}
