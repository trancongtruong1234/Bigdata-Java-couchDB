package map;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

import show.DisplayHelper;

public class find_select {

    public static void main(String[] args) throws MalformedURLException {
     
    }
    public void Find(String id) {
    	//mở kết nối
    	dbconnect dbconnect = new dbconnect();
    	CouchDbConnector db = dbconnect.getConnector();

    	//tìm doc theo id
        Map<String, Object> map2 = db.find(Map.class, id);

        //hiển thị docmuent tìm được
        DisplayHelper.showDocument(map2);
	}
}