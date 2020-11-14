package birdingmaven;

import java.util.Scanner;

import com.mongodb.client.MongoDatabase;

import Controller.Controller;

public class Main {

	public static void main(String[] args) {
           
		
		Scanner reader= new Scanner(System.in); 
           
		View viewme = new View ();
               viewme.print();
               MongoDatabase database = Controller.init();
               Controller.execute(reader);


	}

}
