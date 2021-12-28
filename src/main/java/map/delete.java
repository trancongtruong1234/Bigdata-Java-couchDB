package map;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import org.ektorp.CouchDbConnector;

import show.DisplayHelper;

public class delete {

	public static void main(String[] args) throws MalformedURLException {
    	
    }
    public void Delete(String id) {
    	dbconnect dbconnect = new dbconnect();
    	CouchDbConnector db = dbconnect.getConnector();

        // tạo map = document 
        Map resultMap = db.find(Map.class, id);

        //kiểm tra doccument đã tồn tại chưa, rồi thì xóa
        if (resultMap != null) {
            System.out.println("Database document deleted with id : " + id);
            db.delete(resultMap);
        }
       
        resultMap = db.find(Map.class, id);
       
        //nếu doc k tồn tại thông báo
        if(resultMap == null){
            System.out.println("Empty result");
        }	
	}
}
