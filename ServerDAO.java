import java.util.List;

public interface ServerDAO {
	public int save(Server server);
	
	
	public int update(Server server);

	
	public Server get(Integer id);

	
	public int delete(Integer id);

	
	public List<Server> list();

}
