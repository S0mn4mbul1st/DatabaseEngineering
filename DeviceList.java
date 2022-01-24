
public class DeviceList {
	private int device_list_domain;
	private int list_size;
	private int deviceid_device;
	private int accountid_account;
	private int account_settingaccount_setting_domain;

	
	DeviceList(int device_list_domain,
			   int list_size,
			   int deviceid_device,
			   int accountid_account,
			   int account_settingaccount_setting_domain){
		
		this.device_list_domain = device_list_domain;
		this.list_size = list_size;
		this.deviceid_device = deviceid_device;
		this.accountid_account = accountid_account;
		this.account_settingaccount_setting_domain = account_settingaccount_setting_domain;
	}
	
	public void set_device_list_domain(int device_list_domain) {
		this.device_list_domain = device_list_domain;
	}
	
	public int get_device_list_domain() {
			return this.device_list_domain;
		}
		
	public void set_list_size(int list_size) {
		this.list_size = list_size;
	}
	
	public int get_list_size() {
		return this.list_size;
	}
	
	public void set_deviceid_device(int deviceid_device) {
		this.deviceid_device = deviceid_device;
	}
	
	public int get_deviceid_device() {
		return this.deviceid_device;
	}
	
	public void set_accountid_account(int accountid_account) {
		this.accountid_account = accountid_account;
	}
	
	public int get_accountid_account() {
		return this.accountid_account;
	}
	
	public void set_account_settingaccount_setting_domain(int account_settingaccount_setting_domain) {
		this.account_settingaccount_setting_domain = account_settingaccount_setting_domain;
	}
	
	public int get_account_settingaccount_setting_domain() {
		return this.account_settingaccount_setting_domain;
	}

}
