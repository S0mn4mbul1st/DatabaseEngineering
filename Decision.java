
public class Decision {
	
	private int decision_id;
	private int result;
	private int voice_analyzercomparision_results_list;

	Decision(int decision_id,
			 int result,
			 int voice_analyzercomparision_results_list){
		
		this.decision_id = decision_id;
		this.result = result;
		this.voice_analyzercomparision_results_list = voice_analyzercomparision_results_list;
	}
	
	public void set_decision_id(int decision_id) {
		this.decision_id = decision_id;
	}
	
public int get_decision_id() {
		return this.decision_id;
	}
	
public void set_result(int result) {
	this.result = result;
}

public int get_result() {
	return this.result;
}

public void set_voice_analyzercomparision_results_list(int voice_analyzercomparision_results_list) {
	this.voice_analyzercomparision_results_list = voice_analyzercomparision_results_list;
}

public int get_voice_analyzercomparision_results_list() {
	return this.voice_analyzercomparision_results_list;
}


}
