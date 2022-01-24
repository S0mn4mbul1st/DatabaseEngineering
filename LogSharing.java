
public class LogSharing {
	
	private int id;
	private int shared_id;
	private int user_accountsid;
	private String user_accountsusername;
	private int profileid;
	private int account_listdomain;
	private int logprofileid;
	
	LogSharing(int id, int shared_id, int user_accountsid, String user_accountsusername, int profileid, int account_listdomain, int logprofileid){
		this.id = id;
		this.shared_id = shared_id;
		this.user_accountsid = user_accountsid;
		this.user_accountsusername = user_accountsusername;
		this.profileid = profileid;
		this.account_listdomain = account_listdomain;
		this.logprofileid = logprofileid;
	}
	
	public void set_id(int id) {
		this.id = id;
	}

	public void set_shared_id(int shared_id) {
		this.shared_id = shared_id;
	}
	
	public void set_user_accountsid(int user_accountsid) {
		this.user_accountsid = user_accountsid;
	}
	
	public void set_user_accountsusername(String user_accountsusername) {
		this.user_accountsusername = user_accountsusername;
	}
	
	public void set_profileid(int profileid) {
		this.profileid = profileid;
	}
	
	public void set_account_listdomain(int account_listdomain) {
		this.account_listdomain = account_listdomain;
	}
	
	public void set_logprofileid(int logprofileid) {
		this.logprofileid = logprofileid;
	}
	
	public int get_id() {
		return this.id;
	}
	
	public int get_shared_id() {
		return this.shared_id;
	}
	
	public int get_user_accountsid() {
		return this.user_accountsid;
	}
	
	public String get_user_accountsusername() {
		return this.user_accountsusername;
	}
	
	public int get_profileid() {
		return this.profileid;
	}
	
	public int get_account_listdomain() {
		return this.account_listdomain;
	}
	
	public int get_logprofileid() {
		return this.logprofileid;
	}
}
