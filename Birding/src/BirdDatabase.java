import java.util.ArrayList;

public class BirdDatabase {
  private ArrayList<Bird> Birds;
  
  public BirdDatabase () {
	  this.Birds= new ArrayList<Bird>();
  }
  public void addName(String name, String latiname) {
	  
	  Birds.add(new Bird(name,latiname));
	  
  }
  
	  public void compare(String same) {
		  for (Bird one : Birds)
		  {if (one.contai(same)){
			  System.out.println(one.toString());}
		  }
	  }
	 
	  public void count(String observed) {
			  for (Bird one : Birds)
	  {if (one.contains(observed))
	  {one.setObser(one.getObser() + 1);}
	 	  }
	  }
	  public void print() {
		for  (Bird one : Birds) {
			System.out.println(one.toString());
		}
	  }
	  }
	  
			
	  

	  
