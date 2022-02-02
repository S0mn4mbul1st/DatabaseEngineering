
public class Account {
	private int id_account;
	private String username;
	private String mail_address;
	private String password;
	private int account_listdomain;
	private int voice_recordtime_domain;
	private int voice_recordfrequency_domain;
	private int voice_recordvoice_amplitude;

	Account(int id_account, String username, String mail_address, String password, int account_listdomain,
			int voice_recordtime_domain, int voice_recordfrequency_domain, int voice_recordvoice_amplitude) {

		this.id_account = id_account;
		this.username = username;
		this.mail_address = mail_address;
		this.password = password;
		this.account_listdomain = account_listdomain;
		this.voice_recordtime_domain = voice_recordtime_domain;
		this.voice_recordfrequency_domain = voice_recordfrequency_domain;
		this.voice_recordvoice_amplitude = voice_recordvoice_amplitude;
	}

	public void set_id_account(int id_account) {
		this.id_account = id_account;
	}

	public int get_id_account() {
		return this.id_account;
	}

	public void set_username(String username) {
		this.username = username;
	}

	public String get_username() {
		return this.username;
	}

	public void set_mail_address(String mail_address) {
		this.mail_address = mail_address;
	}

	public String get_mail_address() {
		return this.mail_address;
	}

	public void set_password(String password) {
		this.password = password;
	}

	public String get_password() {
		return this.password;
	}

	public void set_account_listdomain(int account_listdomain) {
		this.account_listdomain = account_listdomain;
	}

	public int get_account_listdomain() {
		return this.account_listdomain;
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

}
