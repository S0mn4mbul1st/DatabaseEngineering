
public class VoiceAnalyzer {
	private int comparision_results_list;
	private int pattern_extractionmfcc_vector;
	private int pattern_extractiondelta_mfcc_vector;
	private int recognized_voicetime_domain;
	private int recognized_voicefrequency_domain;
	private int recognized_voicevoice_amplitude;
	
	VoiceAnalyzer(int comparision_results_list,
				  int pattern_extractionmfcc_vector,
				  int pattern_extractiondelta_mfcc_vector,
				  int recognized_voicetime_domain,
				  int recognized_voicefrequency_domain,
				  int recognized_voicevoice_amplitude){
		this.comparision_results_list = comparision_results_list;
		this.pattern_extractionmfcc_vector = pattern_extractionmfcc_vector;
		this.pattern_extractiondelta_mfcc_vector = pattern_extractiondelta_mfcc_vector;
		this.recognized_voicetime_domain = recognized_voicetime_domain;
		this.recognized_voicefrequency_domain = recognized_voicefrequency_domain;
		this.recognized_voicevoice_amplitude = recognized_voicevoice_amplitude;
	}
	
	public void set_comparision_results_list(int comparision_results_list) {
		this.comparision_results_list = comparision_results_list;
	}
	
	public int get_comparision_results_list() {
			return this.comparision_results_list;
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
	
	public void set_recognized_voicetime_domain(int recognized_voicetime_domain) {
		this.recognized_voicetime_domain = recognized_voicetime_domain;
	}
	
	public int get_recognized_voicetime_domain() {
		return this.recognized_voicetime_domain;
	}
	
	public void set_recognized_voicefrequency_domain(int recognized_voicefrequency_domain) {
		this.recognized_voicefrequency_domain = recognized_voicefrequency_domain;
	}
	
	public int get_recognized_voicefrequency_domain() {
		return this.recognized_voicefrequency_domain;
	}
	
	public void set_recognized_voicevoice_amplitude(int recognized_voicevoice_amplitude) {
		this.recognized_voicevoice_amplitude = recognized_voicevoice_amplitude;
	}
	
	public int get_recognized_voicevoice_amplitude() {
		return this.recognized_voicevoice_amplitude;
	}


}
