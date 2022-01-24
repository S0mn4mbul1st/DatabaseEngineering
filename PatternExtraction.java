
public class PatternExtraction {

	private int mfcc_vector;
	private int delta_mfcc_vector;
	private int recognized_voicetime_domain;
	private int recognized_voicefrequency_domain;
	private int recognized_voicevoice_amplitude;
	
	PatternExtraction(int mfcc_vector,
					  int delta_mfcc_vector,
					  int recognized_voicetime_domain,
					  int recognized_voicefrequency_domain,
					  int recognized_voicevoice_amplitude){
		
		this.mfcc_vector = mfcc_vector;
		this.delta_mfcc_vector = delta_mfcc_vector;
		this.recognized_voicetime_domain = recognized_voicetime_domain;
		this.recognized_voicefrequency_domain = recognized_voicefrequency_domain;
		this.recognized_voicevoice_amplitude = recognized_voicevoice_amplitude;
	}
	
	public void set_mfcc_vector(int mfcc_vector) {
		this.mfcc_vector = mfcc_vector;
	}
	
	public int get_mfcc_vector() {
			return this.mfcc_vector;
		}
		
	public void set_delta_mfcc_vector(int delta_mfcc_vector) {
		this.delta_mfcc_vector = delta_mfcc_vector;
	}
	
	public int get_delta_mfcc_vector() {
		return this.delta_mfcc_vector;
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
