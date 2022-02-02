import java.util.List;

public interface SecurityDAO {
	public int save(Security security);
	
	
	public int update(Security security);

	
	public Security get(Integer id);

	
	public int delete(Integer id);

	
	public List<Security> list();

}
