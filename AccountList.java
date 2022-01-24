
public class AccountList {

	private String domain;
	private int list_size;
	private int serverserver_id;
	private int serverserver_domain;
	private int add_accountoperation_id;
	
	AccountList(String domain,
				 int list_size,
				 int serverserver_id,
				 int serverserver_domain,
				 int add_accountoperation_id){
	
		this.domain = domain;
		this.list_size = list_size;
		this.serverserver_id = serverserver_id;
		this.serverserver_domain = serverserver_domain;
		this.add_accountoperation_id = add_accountoperation_id;
	}
	
	public void set_domain(String domain) {
		this.domain = domain;
	}
	
public String get_domain() {
		return this.domain;
	}
	
	public void set_list_size(int list_size) {
		this.list_size = list_size;
	}
	
	public int get_list_size() {
		return this.list_size;
	}
	
	public void set_serverserver_id(int serverserver_id) {
		this.serverserver_id = serverserver_id;
	}
	
	public int get_serverserver_id() {
		return this.serverserver_id;
	}
	
	public void set_serverserver_domain(int serverserver_domain) {
		this.serverserver_domain = serverserver_domain;
	}
	
	public int get_serverserver_domain() {
		return this.serverserver_domain;
	}
	
	public void set_add_accountoperation_id(int add_accountoperation_id) {
		this.add_accountoperation_id = add_accountoperation_id;
	}
	
	public int get_add_accountoperation_id() {
		return this.add_accountoperation_id;
	}

}
