
public class Action {

	private int transaction_id;
	private String channel;
	private int isPossible;
	private int logprofileid;
	private String command_listcommand_names;
	private int alertalert_id;
	
	Action(int transaction_id,
			String channel,
			int isPossible,
			int logprofileid,
			String command_listcommand_names,
			int alertalert_id){
		
		this.transaction_id = transaction_id;
		this.channel = channel;
		this.isPossible = isPossible;
		this.logprofileid = logprofileid;
		this.command_listcommand_names = command_listcommand_names;
		this.alertalert_id = alertalert_id;
	}

	public void set_transaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	public int get_transaction_id() {
			return this.transaction_id;
		}
	
	public void set_channel(String channel) {
		this.channel = channel;
	}
	
	public String get_channel() {
		return this.channel;
	}
	
	public void set_isPossible(int isPossible) {
		this.isPossible = isPossible;
	}
	
	public int get_isPossible() {
		return this.isPossible;
	}
	
	public void set_logprofileid(int logprofileid) {
		this.logprofileid = logprofileid;
	}
	
	public int get_logprofileid() {
		return this.logprofileid;
	}
	
	public void set_command_listcommand_names(String command_listcommand_names) {
		this.command_listcommand_names = command_listcommand_names;
	}
	
	public String get_command_listcommand_names() {
		return this.command_listcommand_names;
	}
	
	public void set_alertalert_id(int alertalert_id) {
		this.alertalert_id = alertalert_id;
	}
	
	public int get_alertalert_id() {
		return this.alertalert_id;
	}

}
