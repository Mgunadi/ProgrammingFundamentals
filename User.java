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
	
	public void checkCompatibility(Game game) {
		if (Objects.equals(game.getOSname(), os.getOSname()) == true) {
			if (game.getOSversion() <= os.getOSversion()) {
				System.out.println("Your operating system and the game are compatible. Woo hoo!!");
			}
			else if (game.getOSversion() > os.getOSversion()) {
				System.out.println("While you have the correct OS, you are still screwed. You need to update your operating system or find another game to play");
			}
			else System.out.println("Not sure what happened! See Verity to complain");
		}
		else 
			System.out.println("Your operating system and the game are not compatible. Please choose another game");
	}
	
	public void buyContent(Content content) {
		if (content instanceof Game)
			{
			System.out.println("You have chosen to buy a game!");
			checkCompatibility((Game)content);
			}
		else
			{
			System.out.println("You are buying something that doesn't need an operating system.");
			}
		price = content.getPrice();
		if (isPremium == true)
			{
			price = content.getPrice() - (content.getPrice() * 0.1);
			}
		if (enoughBalance(price) == true) {
			//buy
			balance =- price;
			content.addDownload();
			Library.add(content);
			
			};
			
		
		}
	
	public void showcontentBought()
		{
		for (int i = 0; i < Library.size(); i++)
			System.out.println(Library.get(i));
		}
	
	public String getUserID() {
		return UserID;
		}

	
	
}
