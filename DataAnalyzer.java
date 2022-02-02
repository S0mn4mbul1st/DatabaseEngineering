
public class DataAnalyzer {

	private int analysis_id;
	private int analysis_result;
	private int logprofileid;

	DataAnalyzer(int analysis_id, int analysis_result, int logprofileid) {

		this.analysis_id = analysis_id;
		this.analysis_result = analysis_result;
		this.logprofileid = logprofileid;
	}

	public void set_analysis_id(int analysis_id) {
		this.analysis_id = analysis_id;
	}

	public int get_analysis_id() {
		return this.analysis_id;
	}

	public void set_analysis_result(int analysis_result) {
		this.analysis_result = analysis_result;
	}

	public int get_analysis_result() {
		return this.analysis_result;
	}

	public void set_logprofileid(int logprofileid) {
		this.logprofileid = logprofileid;
	}

	public int get_logprofileid() {
		return this.logprofileid;
	}

}
