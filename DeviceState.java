
public class DeviceState {
	
	private Boolean isWorking;
	private int working_duration;
	private int state_id;
	private int deviceid_device;
	
	DeviceState(Boolean isWorking,
				int working_duration,
				int state_id,
				int deviceid_device){
		this.isWorking = isWorking;
		this.working_duration = working_duration;
		this.state_id = state_id;
		this.deviceid_device = deviceid_device;
	}
	
	public void set_isWorking(Boolean isWorking) {
		this.isWorking = isWorking;
	}
	
	public Boolean get_isWorking() {
			return this.isWorking;
		}
	
	public void set_working_duration(int working_duration) {
		this.working_duration = working_duration;
	}
	
	public int get_working_duration() {
		return this.working_duration;
	}
	
	public void set_state_id(int state_id) {
		this.state_id = state_id;
	}
	
	public int get_state_id() {
		return this.state_id;
	}
	
	public void set_deviceid_device(int deviceid_device) {
		this.deviceid_device = deviceid_device;
	}
	
	public int get_deviceid_device() {
		return this.deviceid_device;
	}

}
