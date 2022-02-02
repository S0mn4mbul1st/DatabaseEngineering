import java.util.List;

public interface DeviceTypeDAO {
	public int save(DeviceType account);
	
	
	public int update(DeviceType account);

	
	public DeviceType get(Integer id);

	
	public int delete(Integer id);

	
	public List<DeviceType> list();

}
