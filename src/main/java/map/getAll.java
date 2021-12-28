package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import show.*;
import org.ektorp.CouchDbConnector;

public class getAll {
	public List<Map<String, Object>> GetAll() {
		
		//mở kết nối
    	dbconnect dbconnect = new dbconnect();
    	CouchDbConnector db = dbconnect.getConnector();
    	
    	//chuỗi lưu doc
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();

		//đưa doc vào list
		for(String id:db.getAllDocIds())
		{
			Map<String, Object> doc = db.find(Map.class, id);
			list.add(doc);
		}
		return list;
	}
}
