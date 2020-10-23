
public class Db{
	PetDb petdb = new PetDb();
 public Db() {
	petdb.vaccinPerro.put("rabies",2010);
	petdb.vaccinPerro.put("influenza",2014);
	petdb.vaccinPerro.put("epatiti",2019);
	
	petdb.vaccinGato.put("leukemia", 2009);
	petdb.vaccinGato.put("clamydia", 2007);
	
	Platos menuone = new Platos("soup", "chicken","ice cream", "water");
	Platos menutwo =new Platos ("eggs", "carne","cake","wine");
	petdb.carta.add(menuone);
	petdb.carta.add(menutwo);
	
	
	}
	public void printPlatos() {
	for (Platos one: petdb.carta) 
	{System.out.println(one);}}
	public void printVaccine() {
	 System.out.println(petdb.vaccinGato);
	}
	
	
	@Override
	public String toString() {
		return "Db [petdb=" + petdb + "]";
	}
}
