import java.util.List;

public interface DecisionResultDAO {
	public int save(DecisionResult account);
	
	
	public int update(DecisionResult account);

	
	public DecisionResult get(Integer id);

	
	public int delete(Integer id);

	
	public List<DecisionResult> list();

}
