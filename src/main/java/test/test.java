package test;

import java.beans.SimpleBeanInfo;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.Query;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.ektorp.CouchDbConnector;
import org.ektorp.ViewQuery;

import entity.*;
import map.*;
import show.DisplayHelper;

public class test {

	public static void main(String[] args) {

		dbconnect dbconnect = new dbconnect();
		CouchDbConnector db = dbconnect.getConnector();

		insert aInsert = new insert();
		delete aDelete = new delete();
		find_select aFind_select = new find_select();
		insertUseEntity aInsertUseEntity = new insertUseEntity();
		update aUpdate = new update();
		getAll aGetAll = new getAll();


		// fill the map
		Map<String, Object> map = new HashMap<String, Object>();

		List<Integer> helpful = new ArrayList<Integer>();
		helpful.add(1);
		helpful.add(2);

		String reviewtext;
		reviewtext = "I love these clip on ,vibration reading tuners, This was the second one I tried , "
				+ "The first was a Barcus Berry, which worked equally well, They both have lots of features, "
				+ "such as tap tempo, up and down tuning adjustments. With the Barcus Berry, it was the first one, "
				+ "after trying the Snark, which is a cool name and a lot more colorful, I tuned up a brand new ";

		// map.put("_id", "1");
		map.put("reviewerID", "A2B58VXLLOFQKR");
		map.put("asin", "B003VWJ2K8");
		map.put("reviewerName", "Tran Cong Truong");
		map.put("helpful", helpful);
		map.put("reviewText", reviewtext);
		map.put("overall", 5);
		map.put("summary", "incredible upgrade from my quicktune");
		map.put("unixReviewTime", 1289347200);
		map.put("reviewTime", "11 10, 2010");

		
		// insert by map
		Map<String, Object> map2 = map;
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(map);
		list.add(map2);

		// insert by entity
		ArrayList<Integer> hp = new ArrayList<Integer>();
		hp.add(1);
		hp.add(2);

		// tạo list entity
		List<instruments> aInstruments = new ArrayList<instruments>();
		instruments inst = new instruments();

		inst.setReviewerID("A3MDQTWO6NOV1U");
		inst.setAsin("B003VWJ2K8");
		inst.setReviewerName("Tran Cong Truong");
		inst.setHelpful(hp);
		inst.setReviewText("1,540 people like it,who am i to disagree...it works well");
		inst.setOverall(2);
		inst.setSummary("worth the price");
		inst.setUnixReviewTime(1384041600);
		inst.setReviewTime("11 10, 2013");

		instruments inst2 = new instruments();
		inst2 = inst;

		aInstruments.add(inst);
		aInstruments.add(inst2);
		// aInsertUseEntity.InsertUseEntity(aInstruments);

		// delete
		// aDelete.Delete("48cd0ea629d4e8f087e94017e944f66b");


		// update one
			//Map<String, Object> map3 = db.find(Map.class, "c7b4c9c88c982f4aeba9ea03d700535c");
			//map3.put("reviewerName", "Cong Truong");
			//map3.put("overall", 10);
			
		  //aUpdate.Update(map3);
		
		//update all
    	Map<String, Object> testupdate = new HashMap<String, Object>();
    	testupdate.put("reviewerName", "Tran Cong Truong");
    	testupdate.put("overall", 100);
    	//aUpdate.BulkUpdate(testupdate);
			
		

		 // aInsert.Insert(list);
		 //aInsertUseEntity.InsertUseEntity(aInstruments);
		 //aDelete.Delete("c7b4c9c88c982f4aeba9ea03d700535c");
		 //aUpdate.Update(map3);
    	// aUpdate.BulkUpdate(testupdate);
    	// aFind_select.Find("c7b4c9c88c982f4aeba9ea03d7016fa9");	
    	
    	List<Map<String, Object>> listall = new ArrayList<Map<String,Object>>();
    	listall = aGetAll.GetAll(); 
    	Integer sumInteger = 0;
    	for(Map<String, Object> aMap : listall) {
    		System.out.println(aMap);
    		sumInteger += 1;
    	}
    	System.out.println(sumInteger);
    	
	}

}
