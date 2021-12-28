package map;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import org.ektorp.CouchDbConnector;

import show.DisplayHelper;

public class update {

	public static void main(String[] args) throws MalformedURLException {

    }
    @SuppressWarnings("unchecked")
    
    // hàm update 1 doc
	public void Update(Map<String, Object> map) {
    	dbconnect dbconnect = new dbconnect();
    	CouchDbConnector db = dbconnect.getConnector();
   
        //cập nhật doc truyền vào
        db.update(map); 
        //hiện thị doc vừa được sửa
        DisplayHelper.showDocument(map);
	}
    
    // hàm update toàn bộ database
	public void BulkUpdate(Map<String, Object> map) {
    	dbconnect dbconnect = new dbconnect();
    	CouchDbConnector db = dbconnect.getConnector();
		Integer sum = 0;

		//lặp qua từng doc trong database
		for(String id:db.getAllDocIds())
		{
			Map<String, Object> doc = db.find(Map.class, id);
			
			//lập qua từng thuộc tính của doc, sau đó sửa
			for (Object docid : doc.keySet()) {
				for(Object mapid : map.keySet())
				{
					if (mapid == docid) {
						doc.put((String)docid, map.get(mapid));
						db.update(doc);
					}
				}
			
			}
			sum +=1;
		}
		System.out.println("update row successful "+sum+" row");
	}
}
