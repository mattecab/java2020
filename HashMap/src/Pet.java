import java.util.HashMap;

public class Pet {
    private String petype;
    private HashMap<String, Integer>vaccine;
    public  Pet(String petype,HashMap vaccine) {
    	this.petype=petype;
    	this.vaccine=vaccine;
    }

	@Override
	public String toString() {
		return "Pet [petype=" + petype + ", vaccine=" + vaccine + "]";
	}
    }

