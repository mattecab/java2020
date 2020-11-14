package Controller;

import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import BirdDao.BirdDao;

public class Controller {
	
	public static MongoDatabase init() {
		
		MongoClientURI connectionString = new MongoClientURI(
				"mongodb+srv://mattecab:Matte1983.@Cluster0.hjvvs.mongodb.net/test");
		//create object mongoClient: object to connect, manage, get DBs, handle, ... CRUD, clean, etc ...
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase("birds");
	    return database;
	}
	public static void execute(Scanner reader) {
		MongoCollection<Document> collection = (Controller.init()).getCollection("bird");
    	if (reader.nextLine().equals("Quit")) {
            break;
        } else if (reader.nextLine().equals("Add")) {
            BirdDao.add(reader,collection);
        } else if (reader.nextLine().equals("Observation")) {
            observation(reader,db);
        } else if (reader.nextLine().equals("Show")) {
            show(reader,db);
        } else if (reader.nextLine().equals("Statistics")) {
            statistics(reader,db);
        } else {
            System.out.println("Unknown command!");
}
    	}
}

