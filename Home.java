
public class Home {
	private int id;
	private String address;
	private String tenants;
	
	Home(int id, String address, String tenants){
		this.id = id;
		this.address = address;
		this.tenants = tenants;
	}
	
	public void set_id(int id) {
		this.id = id;
	}
	
	public void set_address(String address) {
			this.address = address;
	}
	
	public void set_tenants(String tenants) {
		this.tenants = tenants;
	}
	
	public String get_tenants() {
		return this.tenants;
	}
	
	public String get_address() {
		return this.address;
	}
	
	public int get_id() {
		return this.id;
	}
}
