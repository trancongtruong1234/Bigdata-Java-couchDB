package map;

import java.net.MalformedURLException;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

public class dbconnect {

    public static void main(String[] args) throws MalformedURLException {
    	dbconnect cnnDbconnect = new dbconnect();
    	cnnDbconnect.getConnector();
    }
    public CouchDbConnector getConnector()
    {
        HttpClient httpClient = null;
		try {
			httpClient = new StdHttpClient.Builder()
			        .url("http://localhost:5984").username("congtruong")
			        .password("trancongtruong1234")
			        .build();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			return null;
		}

        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);

        CouchDbConnector db = dbInstance.createConnector("musical_instruments", true);
        System.out.println("connect successful");
        return db;
    }
}
