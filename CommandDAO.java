import java.util.List;

public interface CommandDAO {
	public int save(Command account);
	
	
	public int update(Command account);

	
	public Command get(Integer id);

	
	public int delete(Integer id);

	
	public List<Command> list();

}
