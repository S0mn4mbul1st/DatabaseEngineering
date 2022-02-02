import java.util.List;

public interface DeviceDAO {
	public int save(Device account);
	
	
	public int update(Device account);

	
	public Device get(Integer id);

	
	public int delete(Integer id);

	
	public List<Device> list();

}
