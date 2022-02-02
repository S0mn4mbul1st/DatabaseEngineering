import java.util.List;

public interface RecognizedVoiceDAO {
	public int save(RecognizedVoice account);
	
	
	public int update(RecognizedVoice account);

	
	public RecognizedVoice get(Integer id);

	
	public int delete(Integer id);

	
	public List<RecognizedVoice> list();

}
