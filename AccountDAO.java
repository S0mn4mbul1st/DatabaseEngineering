import java.util.List;

public interface AccountDAO {
	
	public int save(Account account);
	
	
	public int update(Account account);

	
	public Account get(Integer id);

	
	public int delete(Integer id);

	
	public List<Account> list();

}
