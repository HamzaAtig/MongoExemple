package mongoExemple;

import java.net.UnknownHostException;
import java.util.Set;

import mongoExemple.constants.MongoDBConstants;
import utils.MongoUtils;

import com.mongodb.DB;

public class MongoDBConnexion {

	public static void main(String[] args) throws UnknownHostException {
		// Since 2.10.0
		String mongoDbName = MongoDBConstants.MONGO_DB_DEFAULT_BASE_NAME;
		DB db = MongoUtils.getMongoDB(mongoDbName);
		
		//Display all collections from selected database.
		Set<String> tables = db.getCollectionNames();
		
		for(String coll : tables){
			System.out.println(coll);
		}
	}
}
