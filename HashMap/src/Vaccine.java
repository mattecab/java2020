
public class Vaccine {
  private String vacciname;
  private int year;
  
  public Vaccine(String vacciname, int year) {
	  this.vacciname=vacciname;
	  this.year=year;
  }

@Override
public String toString() {
	return "Vaccin [vacciname=" + vacciname + ", year=" + year + "]";
}

public String getVacciname() {
	return vacciname;
}

public void setVacciname(String vacciname) {
	this.vacciname = vacciname;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
}
