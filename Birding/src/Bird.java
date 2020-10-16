
public class Bird  {
private String name;
private String latiname;
private int obser;


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public  Bird(String name,String latiname) {
	this.name=name;
	this.latiname=latiname;
	this.obser=obser;
}

/*public boolean contains(String observed) {if (observed.equals(name)) {
	return true;}return false;
}
public boolean contai(String same) {if (same.equals(name)) {
	return true;}return false;
}*/
public int getObser() {
	return obser;
}

public void setObser(int obser) {
	this.obser = obser;
}
@Override
public String toString() {
	return (name+", "+ latiname +", "+ obser);
	
}

public String getLatiname() {
	return latiname;
}

public void setLatiname(String latiname) {
	this.latiname = latiname;
}
}
