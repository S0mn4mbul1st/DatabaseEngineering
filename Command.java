
public class Command {

	private String command_listcommand_names;
	private int schedulerschedule_id;

	
	Command(String command_listcommand_names,
			int schedulerschedule_id){
		
		this.command_listcommand_names = command_listcommand_names;
		this.schedulerschedule_id = schedulerschedule_id;
	}
	
	public void set_command_listcommand_names(String command_listcommand_names) {
		this.command_listcommand_names = command_listcommand_names;
	}
	
	public String get_command_listcommand_names() {
			return this.command_listcommand_names;
		}
	
	public void set_schedulerschedule_id(int schedulerschedule_id) {
		this.schedulerschedule_id = schedulerschedule_id;
	}
	
	public int get_schedulerschedule_id() {
		return this.schedulerschedule_id;
	}
}
