import java.util.ArrayList;
public class User {
	
	private String UserID, UserName, phoneNo;
	private double balance;
	private OS OSType;
	
	private boolean isPremium = false; 
	private ArrayList<Content>Library = new ArrayList<Content>();
	
	public User(String ID, String name, String phone, double balance, OS os) {
		UserID = ID;
		UserName = name;
		phoneNo = phone;
		this.balance = balance;
		OSType = os;
	}
	
	public void becomePremium() {
		if ((balance -= 100) > 0){
			balance = balance -= 100;
			isPremium = true;}
		else {
			System.out.println("You do not have enough in your account");
			isPremium = false;}			
		
	}
	
	public void buyContent(Content content) {
		// if-else (if Premium:) ....
		// balance - content.getPrice();
		// content.getDownloads() + 1;
		/// if-else (check for OS compatibility)
	}
	
	public void showcontentBought(){
		
		System.out.println();
		
	}
}
