import java.util.List;

public interface CommandListDAO {
	public int save(CommandList account);
	
	
	public int update(CommandList account);

	
	public CommandList get(Integer id);

	
	public int delete(Integer id);

	
	public List<CommandList> list();

}
