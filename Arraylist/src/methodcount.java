import java.util.Scanner;
import java.util.ArrayList;
class methodcount {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("There are this many items in the list:");  
		System.out.println(countItems(list));


	}
	public static int countItems(ArrayList<String> list) {
	removeFirst(list);
	int l = list.size();
	return l;
	}
	public static void removeFirst(ArrayList<String> list) { 
		list.remove(0); 
		// removes the first item (indexed 0) 
		} 

}
