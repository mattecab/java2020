
import java.util.Scanner;

public class Main { 
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();
 
        while (true) {
            String command = ask(scanner, "Option?");
 
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scanner,db);
            } else if (command.equals("Observation")) {
                observation(scanner,db);
            } else if (command.equals("Show")) {
                show(scanner,db);
            } else if (command.equals("Statistics")) {
                statistics(scanner,db);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
    public static String ask(Scanner input, String option) { 
    	System.out.println(option);
    	return input.nextLine();  }
 
    public static void add(Scanner input, BirdDatabase db) {    
    	System.out.print("name: ");
    	db.addName(input.nextLine(),input.nextLine());
    	

    	}
    public static void observation(Scanner input, BirdDatabase db) { 
    	System.out.println("what was observed");
    	String observed=input.nextLine();
    	db.count(observed);}
 
	
	public static void show(Scanner input, BirdDatabase db) {
    	System.out.print("What?");
    	String same=input.nextLine();
    	db.compare(same);}
 
    public static void statistics(Scanner input, BirdDatabase db) { 
    	db.print();
    }
  }



