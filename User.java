import java.util.ArrayList;
import java.util.Objects;
public class User {
	
	private String UserID, UserName, phoneNo;
	private double balance;
	private OS os;
	
	private boolean isPremium = false; 
	private ArrayList<Content>Library = new ArrayList<Content>();
	boolean hasEnough;
	double price;
	
	public User(String ID, String name, String phone, double balance, OS os) {
		UserID = ID;
		UserName = name;
		phoneNo = phone;
		this.balance = balance;
		this.os = os;
	}
	
	public boolean enoughBalance(double amount) {
		if ((balance - amount) > 0) {
			hasEnough = true;
			return hasEnough;}
		else {
			System.out.println("You do not have enough money in your account");
			hasEnough = false;
			return hasEnough;}	
	}
	
	public void becomePremium() {
		if (enoughBalance(100) == true) {
			balance = balance - 100;
			System.out.println("Your new balance is: $" + balance);
			isPremium = true;
			System.out.println("Congratulations you are now a premium member");
		}		
		else {
			System.out.println("Please add more money into your account and then try again");
			isPremium = false;}			
	}
	
	public void checkCompatibility(Game game) {
		if (Objects.equals(game.getOSname(), os.getOSname()) == true) {
			if (game.getOSversion() <= os.getOSversion()) {
				System.out.println("You have the correct operating system and version to play " + game.getName());
			}
			else 
				{
				System.out.println("You are trying to purchase a game that you do not have the correct version of the operating system");
				System.out.println("You need to update your operating system or choose a different version of " + game.getName());
				}
		}
		else 
			System.out.println("Your operating system and the game are not compatible. Please choose another game");
	}
	
	public void buyContent(Content content) {
		if (content instanceof Game)
			{
			checkCompatibility((Game)content);
			}
		price = content.getPrice();
		if (isPremium == true)
			{
			price = content.getPrice() - (content.getPrice() * 0.1);
			}
		if (enoughBalance(price) == true) {
			//buy
			balance = balance - price;
			content.addDownload();
			Library.add(content);
			System.out.println("You have successfully bought " + content.getName());
			System.out.println("Your balance is now: $" + balance);
			}
		
		}
	
	public void showContentBought()
		{
		for (int i = 0; i < Library.size(); i++)
			System.out.println(Library.get(i));
		}
	
	public String getUserID() {
		return UserID;
		}

	
	
}