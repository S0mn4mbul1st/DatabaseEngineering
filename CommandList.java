
public class CommandList {
	private int device_typeid;
	private String command_names;
	private String type;
	private int time;
	private int device_typeid_device; 
	
	CommandList(int device_typeid, String command_names, String type, int time, int device_typeid_device){
		this.device_typeid = device_typeid;
		this.command_names = command_names;
		this.type = type;
		this.time = time;
		this.device_typeid = device_typeid;
	}
	
	public void set_device_typeid(int device_typeid) {
		this.device_typeid = device_typeid;
	}
	
	public void set_command_names(String command_names) {
		this.command_names = command_names;
	}
	
	public void set_type(String type) {
		this.type = type;
	}
	
	public void set_time(int time) {
		this.time = time;
	}
	
	public void set_device_typeid_device(int device_typeid_device) {
		this.device_typeid_device = device_typeid_device;
	}
	
	public int get_device_typeid() {
		return this.device_typeid;
	}
	
	public String get_command_names() {
		return this.command_names;
	}
	
	public String get_type() {
		return this.type;
	}

	public int get_time() {
		return this.time;
	}
	
	public int get_device_typeid_device() {
		return this.device_typeid_device;
	}
}
