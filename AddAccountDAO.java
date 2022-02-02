import java.util.List;

public interface AddAccountDAO {
	public int save(AddAccount account);
	
	
	public int update(AddAccount account);

	
	public AddAccount get(Integer id);

	
	public int delete(Integer id);

	
	public List<AddAccount> list();

}
