package mongoExemple;

import java.net.UnknownHostException;

import mongoExemple.constants.MongoDBConstants;
import utils.MongoUtils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class MongoDBModify {

	public static void main(String[] args) throws UnknownHostException {

		DB db = MongoUtils
				.getMongoDB(MongoDBConstants.MONGO_DB_DEFAULT_BASE_NAME);
		String collectionName = "acteurs";
		DBCollection collection = db.getCollection(collectionName);

		// find by query
		BasicDBObject query = new BasicDBObject();
		query.put("nom", "Johansson");

		BasicDBObject obj = new BasicDBObject();
		obj.put("nom", "hamza");
		obj.put("age", "28");

		collection.update(query, obj);

		DBCursor cursor = collection.find();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

	}
}
