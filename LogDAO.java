import java.util.List;

public interface LogDAO {
	public int save(Log account);
	
	
	public int update(Log account);

	
	public Log get(Integer id);

	
	public int delete(Integer id);

	
	public List<Log> list();

}
