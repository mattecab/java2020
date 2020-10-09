
public class CashRegister {
	private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;   // the amount of economical lunches sold
    private int gourmetSold;       // the amount of gourmet lunches sold

    public CashRegister() {
    	this.cashInRegister = 1000;
        // at start the register has 1000 euros
    }

    public double payEconomical(double cashGiven) {
    	double lunchPrice = 2.5;
    	if(cashGiven>=lunchPrice) {
    		this.cashInRegister=this.cashInRegister+lunchPrice;
    		this.economicalSold++;
    		return cashGiven-lunchPrice;}
    	else {return cashGiven;}}
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    

    public double payGourmet(double cashGiven) {
    	double lunchP =4;
    	if(cashGiven >= lunchP) {
    		this.cashInRegister += cashGiven;
    		this.gourmetSold++;
            return cashGiven - lunchP;}
    else {return cashGiven ;}}
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    
public boolean payEconomical(LyyraCard card) {
	double ecoLunch =2.5;

	if( card.balance() >= ecoLunch) {
		this.economicalSold++;
        return true;}
else {return false ;}}
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    

public boolean payGourmet(LyyraCard card) {
	double gourmet =4;
if( card.balance() >= gourmet) {
		this.gourmetSold++;
		card.setBalance(); = card.getBalance() - gourmet;
        return true;}
else {return false ;}}
    // the price of the gourmet lunch is 4.00 euros
    // if the balance of the card is at least the price of the lunch:
    //    the amount of sold lunches is incremented by one
    //    the method returns true
    // if not, the method returns false



public void loadMoneyToCard(LyyraCard card, double sum) {
//

	// card.balance= card.balance+sum;
}


public String toString() {
    return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
}
}





