import java.util.*;
public class Account {
	private String name;
	private int numberconto;
	private double saving;
	public double getSaving() {
		return saving;
	}
	public void setSaving(double saving) {
		this.saving = saving;
	}
	public Account(String name) {
        this.name = name;}
Scanner reader = new Scanner(System.in);
public void moneyIn() {
	System.out.println("how much would you like to deposit");
	double deposit= reader.nextDouble();
	this.saving= this.saving + deposit;
	System.out.println("your balance is "+ this.saving);
	
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}