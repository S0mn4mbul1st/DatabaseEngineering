
public class EnrolledVoiceList {
	
	private int enrolled_voice_domain;
	private int voice_analyzercomparision_results_list;
	private int list_size;
	private int voice_recordtime_domain;
	private int voice_recordfrequency_domain;
	private int voice_recordvoice_amplitude;
	private int pattern_extractionmfcc_vector;
	private int pattern_extractiondelta_mfcc_vector;
	
	EnrolledVoiceList(int enrolled_voice_domain,
					  int voice_analyzercomparision_results_list,
					  int list_size,
				 	  int voice_recordtime_domain,
				 	  int voice_recordfrequency_domain,
					  int voice_recordvoice_amplitude,
					  int pattern_extractionmfcc_vector,
					  int pattern_extractiondelta_mfcc_vector){
		
		this.enrolled_voice_domain = enrolled_voice_domain;
		this.voice_analyzercomparision_results_list = voice_analyzercomparision_results_list;
		this.list_size = list_size;
		this.voice_recordtime_domain = voice_recordtime_domain;
		this.voice_recordfrequency_domain = voice_recordfrequency_domain;
		this.voice_recordvoice_amplitude = voice_recordvoice_amplitude;
		this.pattern_extractionmfcc_vector = pattern_extractionmfcc_vector;
		this.pattern_extractiondelta_mfcc_vector = pattern_extractiondelta_mfcc_vector;
	}
	
	public void set_enrolled_voice_domain(int enrolled_voice_domain) {
		this.enrolled_voice_domain = enrolled_voice_domain;
	}
	
	public int get_enrolled_voice_domain() {
			return this.enrolled_voice_domain;
		}
	
	public void set_voice_analyzercomparision_results_list(int voice_analyzercomparision_results_list) {
		this.voice_analyzercomparision_results_list = voice_analyzercomparision_results_list;
	}
	
	public int get_voice_analyzercomparision_results_list() {
		return this.voice_analyzercomparision_results_list;
	}
	
	public void set_list_size(int list_size) {
		this.list_size = list_size;
	}
	
	public int get_list_size() {
		return this.list_size;
	}
	
	public void set_voice_recordtime_domain(int voice_recordtime_domain) {
		this.voice_recordtime_domain = voice_recordtime_domain;
	}
	
	public int get_voice_recordtime_domain() {
		return this.voice_recordtime_domain;
	}
	
	public void set_voice_recordfrequency_domain(int voice_recordfrequency_domain) {
		this.voice_recordfrequency_domain = voice_recordfrequency_domain;
	}
	
	public int get_voice_recordfrequency_domain() {
		return this.voice_recordfrequency_domain;
	}
	
	public void set_voice_recordvoice_amplitude(int voice_recordvoice_amplitude) {
		this.voice_recordvoice_amplitude = voice_recordvoice_amplitude;
	}
	
	public int get_voice_recordvoice_amplitude() {
		return this.voice_recordvoice_amplitude;
	}
	
	public void set_pattern_extractionmfcc_vector(int pattern_extractionmfcc_vector) {
		this.pattern_extractionmfcc_vector = pattern_extractionmfcc_vector;
	}

	public int get_pattern_extractionmfcc_vector() {
		return this.pattern_extractionmfcc_vector;
	}

	public void set_pattern_extractiondelta_mfcc_vector(int pattern_extractiondelta_mfcc_vector) {
		this.pattern_extractiondelta_mfcc_vector = pattern_extractiondelta_mfcc_vector;
	}

	public int get_pattern_extractiondelta_mfcc_vector() {
		return this.pattern_extractiondelta_mfcc_vector;
	}
}
