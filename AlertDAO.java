import java.util.List;

public interface AlertDAO {
	public int save(Alert account);
	
	
	public int update(Alert account);

	
	public Alert get(Integer id);

	
	public int delete(Integer id);

	
	public List<Alert> list();

}
