
public class DeviceType {
	
	private int device_type_id;
	private String type;
	
	DeviceType(int device_type_id, String type){
		this.device_type_id = device_type_id;
		this.type = type;
	}
	
	public void set_device_type_id(int device_type_id)
	{
		this.device_type_id = device_type_id;
	}
	
	public void set_type(String type)
	{
		this.type = type;
	}
	
	public int get_device_type_id()
	{
		return this.device_type_id;
	}
	
	public String get_type()
	{
		return this.type;
	}
}
