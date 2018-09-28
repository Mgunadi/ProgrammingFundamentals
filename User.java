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
