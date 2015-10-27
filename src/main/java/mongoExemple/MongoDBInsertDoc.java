package mongoExemple;

import java.net.UnknownHostException;

import mongoExemple.constants.MongoDBConstants;
import utils.MongoUtils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class MongoDBInsertDoc {

	public static void main(String[] args) throws UnknownHostException {

		DB db = MongoUtils
				.getMongoDB(MongoDBConstants.MONGO_DB_DEFAULT_BASE_NAME);

		String collectionName = "acteurs";
		DBCollection collection = db.getCollection(collectionName);

		BasicDBObject document = new BasicDBObject();
		document.put("nom", "Johansson");
		collection.insert(document);

		DBCursor cursor = collection.find();

		while (cursor.hasNext()) {
			System.out.println(cursor.next().get("nom"));
		}

	}
}
