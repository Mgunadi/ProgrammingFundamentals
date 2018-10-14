
public class BalanceException extends Exception{
	
	
	private double balance;
	
	public BalanceException(double balance, double amount) {
		super("Invalid balance " + balance);
	}
	
	public double getBalance() {
		return balance;
	}
	
	private String reason;
	private double maxAvailable;
	
	public String getReason() {
		return reason;
	}
	
	public double maxAvailable() {
		return maxAvailable;
	}
	
	public BalanceException(String reason) {
		this.reason = reason;
	}
	
	public BalanceException(String reason, double maxAvailable) {
		this.reason = reason;
		this.maxAvailable = maxAvailable;
	}

}