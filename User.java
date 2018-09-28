import java.util.ArrayList;
public class User {
	
	private String UserID, UserName, phoneNo;
	private double balance;
	private OS OSType;
	
	private boolean isPremium = false; 
	private ArrayList<Content>Library = new ArrayList<Content>();
	boolean hasEnough;
	
	public User(String ID, String name, String phone, double balance, OS os) {
		UserID = ID;
		UserName = name;
		phoneNo = phone;
		this.balance = balance;
		OSType = os;
	}
	
	public boolean enoughBalance(double amount) {
		if ((balance -= amount) > 0) {
			System.out.println("Congratulations you have enough money!!!");
			hasEnough = true;
			return hasEnough;}
		else {
			System.out.println("You do not have enough money in your account");
			hasEnough = false;
			return hasEnough;}	
	}
	
	public void becomePremium() {
		if (enoughBalance(100) == true) {
			balance -= 100;
			System.out.println("Your new balance is: $" + balance);
			isPremium = true;
			System.out.println("Congratulations you are now a premium member");
		}
		
		else {
			System.out.println("You do not have enough in your account");
			System.out.println("Please add more money into your account and then try again");
			isPremium = false;}			
	}
	
	public void buyContent(Content content) {
		/*double price = content.getPrice();
		if (Premium = true)
			price = content.getPrice() - (content.getPrice() * 0.1); 
		else price = price;
		if (enoughBalance(price) == true) {
			//buy
			balance =- price;
			//content.getDownloads() + 1;
			Library.add(content);
		}
		else {
			System.out.println("You do not have enough in your account");
			//not allowed to buy
		}
	
	public void showcontentBought(){
		for (int i = 0; i < Library.size(); i++)
			System.out.println(Library.get(i));
	}*/
		
	}
}
