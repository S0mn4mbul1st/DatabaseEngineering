import java.util.List;

public interface DeviceStateDAO {
	public int save(DeviceState account);
	
	
	public int update(DeviceState account);

	
	public DeviceState get(Integer id);

	
	public int delete(Integer id);

	
	public List<DeviceState> list();

}
