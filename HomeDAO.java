import java.util.List;

public interface HomeDAO {
	public int save(Home account);
	
	
	public int update(Home account);

	
	public Home get(Integer id);

	
	public int delete(Integer id);

	
	public List<Home> list();

}
