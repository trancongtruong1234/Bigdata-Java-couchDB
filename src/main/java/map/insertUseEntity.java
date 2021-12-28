package map;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.ektorp.CouchDbConnector;
import org.w3c.dom.ls.LSException;

import entity.*;
import show.DisplayHelper;

public class insertUseEntity {

	public static void main(String[] args) throws MalformedURLException {

	}

	public void InsertUseEntity(List<instruments> aInstruments) {
		// Kết nối
		dbconnect dbconnect = new dbconnect();
		CouchDbConnector db = dbconnect.getConnector();

		for (instruments list : aInstruments) {

			// chèn 1 doc chỉ có id
			Map<String, Object> map;
			map = new HashMap<String, Object>();
			db.create(map);

			// láy id của doc vừa chèn
			String idString = (String) map.get("_id");

			// Thêm thuộc tính cho entity
			instruments inst = db.get(instruments.class, idString);

			inst.setReviewerID(list.getReviewerID());
			inst.setAsin(list.getAsin());
			inst.setReviewerName(list.getReviewerName());
			inst.setHelpful(list.getHelpful());
			inst.setReviewText(list.getReviewText());
			inst.setOverall(list.getOverall());
			inst.setSummary(list.getSummary());
			inst.setUnixReviewTime(list.getUnixReviewTime());
			inst.setReviewTime(list.getReviewTime());

			// chèn entity vào database
			db.update(inst);
			
			// hiển thị doc vừa chèn
			map = db.find(Map.class, idString);
			DisplayHelper.showDocument(map);
		}
	}

}
