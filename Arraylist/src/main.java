import java.util.Scanner;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nameslist = new ArrayList();
	    for (int i = 0; i<=nameslist.size();i++) {
		System.out.println("please enter a name");
		
		Scanner reader = new Scanner (System.in);
        String name = reader.nextLine();
        nameslist.add(name);
        
        if (name.equals(" ")){
        	 System.out.println(nameslist.get(i));}
	}}
}
