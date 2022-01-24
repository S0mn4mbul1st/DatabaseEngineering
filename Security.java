
public class Security {
	private int system_hash;
	private int enrolled_voice_listenrolled_voice_domain;
	private int recognized_voicevoice_amplitude;
	private int recognized_voicefrequency_domain;
	private int recognized_voicetime_domain;
	private int pattern_extractionmfcc_vector;
	private int pattern_extractiondelta_mfcc_vector;
	
	Security(int system_hash,
			 int enrolled_voice_listenrolled_voice_domain,
			 int recognized_voicevoice_amplitude,
			 int recognized_voicefrequency_domain,
			 int recognized_voicetime_domain,
			 int pattern_extractionmfcc_vector,
			 int pattern_extractiondelta_mfcc_vector){
		
		this.system_hash = system_hash;
		this.enrolled_voice_listenrolled_voice_domain = enrolled_voice_listenrolled_voice_domain;
		this.recognized_voicevoice_amplitude = recognized_voicevoice_amplitude;
		this.recognized_voicefrequency_domain = recognized_voicefrequency_domain;
		this.recognized_voicetime_domain = recognized_voicetime_domain;
		this.pattern_extractionmfcc_vector = pattern_extractionmfcc_vector;
		this.pattern_extractiondelta_mfcc_vector = pattern_extractiondelta_mfcc_vector;
	}
	
	public void set_system_hash(int system_hash) {
		this.system_hash = system_hash;
	}
	
public int get_system_hash() {
		return this.system_hash;
	}

public void set_enrolled_voice_listenrolled_voice_domain(int enrolled_voice_listenrolled_voice_domain) {
	this.enrolled_voice_listenrolled_voice_domain = enrolled_voice_listenrolled_voice_domain;
}

public int get_enrolled_voice_listenrolled_voice_domain() {
	return this.enrolled_voice_listenrolled_voice_domain;
}

public void set_recognized_voicevoice_amplitude(int recognized_voicevoice_amplitude) {
	this.recognized_voicevoice_amplitude = recognized_voicevoice_amplitude;
}

public int get_recognized_voicevoice_amplitude() {
	return this.recognized_voicevoice_amplitude;
}

public void set_recognized_voicefrequency_domain(int recognized_voicefrequency_domain) {
	this.recognized_voicefrequency_domain = recognized_voicefrequency_domain;
}

public int get_recognized_voicefrequency_domain() {
	return this.recognized_voicefrequency_domain;
}

public void set_recognized_voicetime_domain(int recognized_voicetime_domain) {
	this.recognized_voicetime_domain = recognized_voicetime_domain;
}

public int get_recognized_voicetime_domain() {
	return this.recognized_voicetime_domain;
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
