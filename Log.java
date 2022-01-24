
public class Log {
	private int profileid;
	private String sensorOutput;
	private int time;
	private int transactionId;
	private int accountid_account;
	private int data_analyzeranalysis_id;
	private int alertalert_id;
	
	Log(int profileid, 
		String sensorOutput,
		int time,
		int transactionId,
		int accountid_account,
		int data_analyzeranalysis_id,
		int alertalert_id){
		
		this.profileid = profileid;
		this.sensorOutput = sensorOutput;
		this.time = time;
		this.transactionId = transactionId;
		this.accountid_account = accountid_account;
		this.data_analyzeranalysis_id = data_analyzeranalysis_id;
		this.alertalert_id = alertalert_id;
	}
	
	public void set_profileid(int profileid) {
		this.profileid = profileid;
	}
	
	public int get_profileid() {
			return this.profileid;
		}
	
	public void set_sensorOutput(String sensorOutput) {
		this.sensorOutput = sensorOutput;
	}
	
	public String get_sensorOutput() {
		return this.sensorOutput;
	}
	
	public void set_time(int time) {
		this.time = time;
	}
	
	public int get_time() {
		return this.time;
	}
	
	public void set_transactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	public int get_transactionId() {
		return this.transactionId;
	}
	
	public void set_accountid_account(int accountid_account) {
		this.accountid_account = accountid_account;
	}
	
	public int get_accountid_account() {
		return this.accountid_account;
	}
	
	public void set_data_analyzeranalysis_id(int data_analyzeranalysis_id) {
		this.data_analyzeranalysis_id = data_analyzeranalysis_id;
	}
	
	public int get_data_analyzeranalysis_id() {
		return this.data_analyzeranalysis_id;
	}
	
	public void set_alertalert_id(int alertalert_id) {
		this.alertalert_id = alertalert_id;
	}
	
	public int get_alertalert_id() {
		return this.alertalert_id;
	}
}
