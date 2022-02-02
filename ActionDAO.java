import java.util.List;

public interface ActionDAO {
	public int save(Action account);
	
	
	public int update(Action account);

	
	public Action get(Integer id);

	
	public int delete(Integer id);

	
	public List<Action> list();

}
