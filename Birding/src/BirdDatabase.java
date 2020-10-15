import java.util.ArrayList;

public class BirdDatabase extends Bird {
  private ArrayList<Bird> Birds;
  
  public BirdDatabase () {
	  this.Birds= new ArrayList<Bird>();
  }
  public void addName(String name, String latiname) {
	  Bird one=new Bird();
	  one.setName(name);
	  one.setLatiname(latiname);
  }
  public void addLatin(String latiname) {
	  ;
  }
	  public void compare(String same) {
		  for (Bird one : Birds)
		  {if (one.contains(same)){
			  System.out.println(one.toString());
		  }else {System.out.println("not found"); }}}
	 
	  public void count(String observed, int obser) {
			  for (Bird one : Birds)
	  {if (one.contains(observed))
	  {one.setObser(one.getObser() + 1);
	  System.out.println(one.getObser());}
			
	  }

	  }}
