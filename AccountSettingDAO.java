import java.util.List;

public interface AccountSettingDAO {
	public int save(AccountSetting account);
	
	
	public int update(AccountSetting account);

	
	public AccountSetting get(Integer id);

	
	public int delete(Integer id);

	
	public List<AccountSetting> list();

}
