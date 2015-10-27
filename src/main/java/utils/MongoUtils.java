package utils;

import java.net.UnknownHostException;

import mongoExemple.constants.MongoDBConstants;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoUtils {

	public static DB getMongoDB(String mongoDbName) throws UnknownHostException {
		MongoClient mongoClient = new MongoClient(
				MongoDBConstants.MONGO_DB_HOST, MongoDBConstants.MONGO_DB_DEFAULT_PORT);
		return mongoClient.getDB(mongoDbName);
	}
}
