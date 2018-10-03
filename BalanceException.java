
class BalanceException extends Exception{
	
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
