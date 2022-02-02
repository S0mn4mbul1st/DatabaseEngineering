import java.util.List;

public interface DeviceListDAO {
	public int save(DeviceList account);
	
	
	public int update(DeviceList account);

	
	public DeviceList get(Integer id);

	
	public int delete(Integer id);

	
	public List<DeviceList> list();

}
