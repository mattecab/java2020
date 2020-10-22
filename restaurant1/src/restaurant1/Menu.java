package restaurant1;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
	private ArrayList<Platos>carta;
	
	public void Menu() {
	
	
	carta=new ArrayList<Platos>();
    
	Platos menuone = new Platos("soup", "chicken","ice cream", "water");
	carta.add(menuone);
	
	Platos menutwo =new Platos ("eggs", "carne","cake","wine");
	carta.add(menutwo);
	
	HashMap<Platos, Integer> hsp= new HashMap<Platos, Integer>();
	hsp.put(menuone,10);
	hsp.put(menutwo,15);
    for (Platos primero : carta ) {System.out.println(primero);}
    
   
   
}

	

    
	
	

	
}