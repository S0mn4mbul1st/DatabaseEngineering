
public class Scheduler {
	
	private int schedule_id;
	private int from;
	private int to;
	private int actiontransaction_id;
	
	Scheduler(int schedule_id,
			  int from,
			  int to,
			  int actiontransaction_id){
		
		this.schedule_id = schedule_id;
		this.from = from;
		this.to = to;
		this.actiontransaction_id = actiontransaction_id;
	}
	
	public void set_schedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}
	
	public int get_schedule_id() {
			return this.schedule_id;
		}
	
	public void set_from(int from) {
		this.from = from;
	}
	
	public int get_from() {
		return this.from;
	}
	
	public void set_to(int to) {
		this.to = to;
	}
	
	public int get_to() {
		return this.to;
	}
	
	public void set_actiontransaction_id(int actiontransaction_id) {
		this.actiontransaction_id = actiontransaction_id;
	}
	
	public int get_actiontransaction_id() {
		return this.actiontransaction_id;
	}
}
