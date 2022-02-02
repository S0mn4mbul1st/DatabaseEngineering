import java.util.List;

public interface VoiceAnalyzerDAO {
	public int save(VoiceAnalyzer voiceAnalyzer);
	
	
	public int update(VoiceAnalyzer voiceAnalyzer);

	
	public VoiceAnalyzer get(Integer id);

	
	public int delete(Integer id);

	
	public List<VoiceAnalyzer> list();

}
