
public class AddAccount {
	
	private int operation_id;
	private String name;
	private String surname;
	private String username;
	private String email;
	private int age;
	private int password;
	
	AddAccount(int operation_id,
			   String name,
			   String surname,
			   String username,
			   String email,
			   int age,
			   int password){
		
		this.operation_id = operation_id;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.email = email;
		this.age = age;
		this.password = password;
	}
	
	public void set_(int operation_id) {
		this.operation_id = operation_id;
	}
	
	public int get_operation_id() {
			return this.operation_id;
		}
		
	public void set_name(String name) {
		this.name = name;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public void set_surname(String surname) {
		this.surname = surname;
	}
	
	public String get_surname() {
		return this.surname;
	}
	
	public void set_username(String username) {
		this. username =  username;
	}
	
	public String get_username() {
		return this. username;
	}
	
	public void set_email(String email) {
		this.email = email;
	}
	
	public String get_email() {
		return this.email;
	}
	
	public void set_age(int age) {
		this.age = age;
	}
	
	public int get_age() {
		return this.age;
	}
	
	public void set_password(int password) {
		this.password = password;
	}
	
	public int get_password() {
		return this.password;
	}
	

}
