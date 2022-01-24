
public class DecisionResult{
	
	private int decision_result_id;
	private int serverserver_id;
	private int serverserver_domain;
	private Boolean status;
	private int decisiondecision_id;
	
	DecisionResult(int decision_result_id,
				   int serverserver_id,
				   int serverserver_domain,
				   Boolean status,
				   int decisiondecision_id){
		
		this.decision_result_id = decision_result_id;
		this.serverserver_id = serverserver_id;
		this.serverserver_domain = serverserver_domain;
		this.status = status;
		this.decisiondecision_id = decisiondecision_id;
	}
	
	public void set_decision_result_id(int decision_result_id) {
			this.decision_result_id = decision_result_id;
		}
		
	public int get_decision_result_id() {
			return this.decision_result_id;
		}
		
	
	public void set_serverserver_id(int serverserver_id) {
			this.serverserver_id = serverserver_id;
		}
		
	public int get_serverserver_id() {
			return this.serverserver_id;
		}
		
	
	public void set_serverserver_domain(int serverserver_domain) {
			this.serverserver_domain = serverserver_domain;
		}
		
	public int get_serverserver_domain() {
			return this.serverserver_domain;
		}
		
	
	public void set_status(Boolean status) {
			this.status = status;
		}
		
	public Boolean get_status() {
			return this.status;
		}
		
	
	public void set_decisiondecision_id(int decisiondecision_id) {
			this.decisiondecision_id = decisiondecision_id;
		}
		
	public int get_decisiondecision_id() {
			return this.decisiondecision_id;
		}
	
}
