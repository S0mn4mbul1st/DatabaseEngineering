import java.util.List;

public interface EnrolledVoiceListDAO {
	public int save(EnrolledVoiceList account);
	
	
	public int update(EnrolledVoiceList account);

	
	public EnrolledVoiceList get(Integer id);

	
	public int delete(Integer id);

	
	public List<EnrolledVoiceList> list();

}
