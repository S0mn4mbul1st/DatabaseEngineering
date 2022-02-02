import java.util.List;

public interface DecisionDAO {
	public int save(Decision account);
	
	
	public int update(Decision account);

	
	public Decision get(Integer id);

	
	public int delete(Integer id);

	
	public List<Decision> list();

}
