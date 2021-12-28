package map;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.Document;

import org.ektorp.CouchDbConnector;
import show.*;

public class insert {

    public static void main(String[] args) throws MalformedURLException {
      
    }
    public  void  Insert(List<Map<String, Object>> list ) {
    	
    	// mở kết nối
    	dbconnect dbconnect = new dbconnect();
    	CouchDbConnector db = dbconnect.getConnector();
    	
        // insert list vào database
    	db.executeBulk(list);
        System.out.println("insert successful");
        
        for(Map a: list)
        {
        	DisplayHelper.showDocument(a);
        }
	}
  
}