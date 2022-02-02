import java.util.List;

public interface AccountListDAO {
	
	public int save(AccountList account);
	
	
	public int update(AccountList account);

	
	public AccountList get(Integer id);

	
	public int delete(Integer id);

	
	public List<AccountList> list();

}
