
public class BalanceException extends Exception{
	
	
	private double balance, amount;
	
	public BalanceException(double balance, double amount)
		{
		super("This purchase will result in a negative balance of $" + (balance - amount) +
				"\n The purchase will not go ahead" + 
				"\n Please choose a product that is less than $" + balance);
		}
}