
public class RecognizedVoice {
	
	private int time_domain;
	private int frequency_domain;
	private int voice_amplitude;
	private int time;
	
	RecognizedVoice(int time_domain,
					int frequency_domain,
					int voice_amplitude, 
					int time){
		
		this.time_domain = time_domain;
		this.frequency_domain = frequency_domain;
		this.voice_amplitude = voice_amplitude;
		this.time = time;
	}
	
	public void set_time_domain(int time_domain) {
		this.time_domain = time_domain;
	}
	
	public int get_time_domain() {
			return this.time_domain;
		}
		
	public void set_frequency_domain(int frequency_domain) {
		this.frequency_domain = frequency_domain;
	}
	
	public int get_frequency_domain() {
		return this.frequency_domain;
	}
	
	public void set_voice_amplitude(int voice_amplitude) {
		this.voice_amplitude = voice_amplitude;
	}
	
	public int get_voice_amplitude() {
		return this.voice_amplitude;
	}
	
	public void set_time(int time) {
		this.time = time;
	}
	
	public int get_time() {
		return this.time;
	}

}
