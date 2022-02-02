import java.util.List;

public interface DataAnalyzerDAO {
	public int save(DataAnalyzer account);
	
	
	public int update(DataAnalyzer account);

	
	public DataAnalyzer get(Integer id);

	
	public int delete(Integer id);

	
	public List<DataAnalyzer> list();

}
