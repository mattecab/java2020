package restaurant1;

public class Platos {
String starter;
String main;
String dessert;
String drink;

     public Platos(String starter, String main, String dessert, String drink) {
    	 this.starter=starter;
    	 this.main=main;
    	 this.dessert=dessert;
    	 this.drink=drink;
     }

	@Override
	public String toString() {
		return "Platos [starter=" + starter + ", main=" + main + ", dessert=" + dessert + ", drink=" + drink + "]";
	}
    
	
	}

