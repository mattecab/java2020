import java.util.*;
import java.util.ArrayList;
public class Accounts {

	public static void main(String[] args) {
		ArrayList<Account> Accounts = new ArrayList<>();
		Accounts.add(new Account ("Jaime"));
		Accounts.add(new Account ("Ruth"));
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Account name");
        int i=Accounts.valueOf(reader.nextLine());
        System.out.println("write deposit or withdrawal");
        String deposit=reader.nextLine();
        if (deposit.equals("deposit"));
        String nam= String.valueOf(i);
        System.out.println(i);
        //{Accounts.savings.moneyIn();}
      //  else {
      //  Accounts.get(i).moneyOut();}
		
	}

}
