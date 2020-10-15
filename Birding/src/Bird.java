
public class Bird {
private String name;
private String latiname;
private int obser;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Bird() {
	this.name=name;
	this.latiname=latiname;
	this.obser=obser;
}

public boolean contains(String same) {
	return true;
}

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
