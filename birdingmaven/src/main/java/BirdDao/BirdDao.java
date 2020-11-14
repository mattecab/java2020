
package BirdDao;

import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import Controller.Controller;



public class BirdDao {
	
	
	public static void add(Scanner input, MongoCollection<Document> collection) {  
	Document bird = new Document("_id", new ObjectId());
	System.out.println("name");
	String name= (input.nextLine());
	System.out.println("Latiname");
	String latiname= (input.nextLine());
	bird.append("name",  name ).append("latiname", latiname);
	//add that document to birds collection
	collection.insertOne(bird);

	}}
