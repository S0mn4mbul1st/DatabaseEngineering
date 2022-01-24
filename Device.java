
public class Device {
	private int id_device;
	private int device_typeid;
	private String location;
	private int device_typeid_device;
	private int homeid;
	private int device_statestate_id;
	
	Device( int id_device,
			int device_typeid,
			String location,
			int device_typeid_device,
			int homeid,
			int device_statestate_id){
		 
		  this.id_device = id_device;
		  this.device_typeid = device_typeid;
		  this.location = location;
		  this.device_typeid_device = device_typeid_device;
		  this.homeid = homeid;
		  this.device_statestate_id = device_statestate_id;
	}
	
	public void set_id_device(int id_device) {
		  this.id_device = id_device;
	}
	
	public void set_device_typeid(int device_typeid) {
		  this.device_typeid = device_typeid;
	}
	
	public void set_location(String location) {
		  this.location = location;
		}
	
	public void set_device_typeid_device(int device_typeid_device) {
		  this.device_typeid_device = device_typeid_device;
	}
	
	public void set_homeid(int homeid) {
		  this.homeid = homeid;
	}
	
	public void set_device_statestate_id(int device_statestate_id) {
		  this.device_statestate_id = device_statestate_id;
	}
	
	public int get_id_device() {
		return this.id_device;
	}
	
	public int get_device_typeid() {
		return this.device_typeid;
	}
	
	public String get_location() {
		return this.location;
		}
	
	public int get_device_typeid_device() {
		return this.device_typeid_device;
	}
	
	public int get_homeid() {
		return this.homeid;
	}
	
	public int get_device_statestate_id() {
		return this.device_statestate_id;
	}
}
