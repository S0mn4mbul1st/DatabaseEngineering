
public class AccountSetting {
	private int account_setting_domain;
	private int profileid;
	private String commandList;
	private int accountid_account;
	
	AccountSetting(int account_setting_domain,
				   int profileid,
				   String commandList,
				   int accountid_account){
		
		this.account_setting_domain = account_setting_domain;
		this.profileid = profileid;
		this.commandList = commandList;
		this.accountid_account = accountid_account;
	}
	
	public void set_account_setting_domain(int account_setting_domain) {
		this.account_setting_domain = account_setting_domain;
	}
	
	public int get_account_setting_domain() {
			return this.account_setting_domain;
		}
	
	public void set_profileid(int profileid) {
		this.profileid = profileid;
	}
	
	public int get_profileid() {
		return this.profileid;
	}
	
	public void set_commandList(String commandList) {
		this.commandList = commandList;
	}
	
	public String get_commandList() {
		return this.commandList;
	}
	
	public void set_accountid_account(int accountid_account) {
		this.accountid_account = accountid_account;
	}
	
	public int get_accountid_account() {
		return this.accountid_account;
	}


}
