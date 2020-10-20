package controller;

public class Controller {
	
	while (true) {
        String command = new Menu(reader, "Option?");

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
