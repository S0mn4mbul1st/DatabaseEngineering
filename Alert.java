
public class Alert {
	private int alert_id;
	private int alert_time;
	private String description;
	private int actiontransaction_id;
	
	Alert(int alert_id,
		  int alert_time,
		  String description,
		  int actiontransaction_id){
	
		this.alert_id = alert_id;
		this.alert_time = alert_time;
		this.description = description;
		this.actiontransaction_id = actiontransaction_id;
	}
	
	public void set_alert_id(int alert_id) {
		this.alert_id = alert_id;
	}
	
public int get_alert_id(){
		return this.alert_id;
	}
	
	public void set_alert_time(int alert_time) {
		this.alert_time = alert_time;
	}
	
	public int get_alert_time() {
		return this.alert_time;
	}
	
	public void set_description(String description) {
		this.description = description;
	}
	
	public String get_description() {
		return this.description;
	}
	
	public void set_actiontransaction_id(int actiontransaction_id) {
		this.actiontransaction_id = actiontransaction_id;
	}
	
	public int get_actiontransaction_id() {
		return this.actiontransaction_id;
	}

}
