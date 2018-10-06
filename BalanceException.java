
public class BalanceException extends Exception{
	
	
	private double balance;
	private double amount;
	
	public BalanceException(double balance, double amount)
		{
		//super("Invalid balance " + balance);
		super("This purchase will result in a negative balance of $" + (balance - amount) +
				"\n The purchase will not go ahead" + 
				"\n Please choose a product that is less than $" + balance);
		//this.balance = balance;
		//this.amount = amount;
		}
}