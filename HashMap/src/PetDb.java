import java.util.HashMap;

public class PetDb {
	
	public void PetDb() {
		HashMap<String, Integer> vaccinPerro = new HashMap <String,Integer> ();
		HashMap<String, Integer> vaccinGato = new HashMap <String,Integer> ();
		
		
		vaccinPerro.put("rabies",2010);
		vaccinPerro.put("influenza",2014);
		vaccinPerro.put("epatiti",2019);
		
		vaccinGato.put("leukemia", 2009);
		vaccinGato.put("clamydia", 2007);
	    
		Pet Perro =new Pet("cane", vaccinPerro);
	    Pet Gato = new Pet("gato", vaccinGato);
	    
	    System.out.println(Perro);
	    System.out.println(Gato);
	}
}
