import java.util.List;

public interface SchedulerDAO {
	public int save(Scheduler scheduler);
	
	
	public int update(Scheduler scheduler);

	
	public Scheduler get(Integer id);

	
	public int delete(Integer id);

	
	public List<Scheduler> list();

}
