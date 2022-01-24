
public class Server {
	private int server_id;
	private int server_domain;
	private int server_time;
	private int accountid_account;
	private int securitysystem_hash;
	private int add_accountoperation_id;

	Server(int server_id,
		   int server_domain,
		   int server_time,
		   int accountid_account,
		   int securitysystem_hash,
		   int add_accountoperation_id){
		
		this.server_id = server_id;
		this.server_domain = server_domain;
		this.server_time = server_time;
		this.accountid_account = accountid_account;
		this.securitysystem_hash = securitysystem_hash;
		this.add_accountoperation_id = add_accountoperation_id;
	}
	
	public void set_server_id(int server_id) {
		this.server_id = server_id;
	}
	
	public int get_server_id() {
			return this.server_id;
		}
		
	public void set_server_domain(int server_domain) {
		this.server_domain = server_domain;
	}
	
	public int get_server_domain() {
		return this.server_domain;
	}
	
	public void set_server_time(int server_time) {
		this.server_time = server_time;
	}
	
	public int get_server_time() {
		return this.server_time;
	}
	
	public void set_accountid_account(int accountid_account) {
		this.accountid_account = accountid_account;
	}
	
	public int get_accountid_account() {
		return this.accountid_account;
	}
	
	public void set_securitysystem_hash(int securitysystem_hash) {
		this.securitysystem_hash = securitysystem_hash;
	}
	
	public int get_securitysystem_hash() {
		return this.securitysystem_hash;
	}
	
	public void set_add_accountoperation_id(int add_accountoperation_id) {
		this.add_accountoperation_id = add_accountoperation_id;
	}
	
	public int get_add_accountoperation_id() {
		return this.add_accountoperation_id;
	}

}
