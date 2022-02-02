import java.util.List;

public interface PatternExtractionDAO {
	public int save(PatternExtraction account);
	
	
	public int update(PatternExtraction account);

	
	public PatternExtraction get(Integer id);

	
	public int delete(Integer id);

	
	public List<PatternExtraction> list();

}
