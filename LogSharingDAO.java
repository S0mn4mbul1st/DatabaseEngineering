import java.util.List;

public interface LogSharingDAO {
	public int save(LogSharing account);
	
	
	public int update(LogSharing account);

	
	public LogSharing get(Integer id);

	
	public int delete(Integer id);

	
	public List<LogSharing> list();

}
