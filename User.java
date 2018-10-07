import java.util.ArrayList;
import java.util.Objects;
public class User {
	
	private String UserID, UserName, phoneNo;
	private double balance;
	private OS os;
	
	private boolean isPremium = false; 
	private ArrayList<Content>Library = new ArrayList<Content>();
	//boolean hasEnough;
	double price;
	
	public User(String ID, String name, String phone, double balance, OS os)
		{
		UserID = ID;
		UserName = name;
		phoneNo = phone;
		this.balance = balance;
		this.os = os;
		}
	
	public void becomePremium()
		{
		try
			{	
			if (balance < 100)
				{
				throw new BalanceException(balance, 100);
				}
			balance = balance - 100;
			isPremium = true;
			System.out.println("Congratulations " + UserName + " you are now a premium member");
			}
		catch (BalanceException e)
			{
			System.out.println(e);
			System.out.println("You are not a premium member");
			}	
		}
	
	public void checkCompatibility(Game game)
		{
		try {
			if (Objects.equals(game.getOSname(), os.getOSname()) == true)
				{
				if (game.getOSversion() <= os.getOSversion())
					{
				System.out.println("You have the correct operating system and version to play " + game.getName());
					}
				else
					{
					throw new VersionException(os.getOSversion(), game.getOSversion());
					}
				}
			else
				{
				throw new OSException(os.getOSname(), game.getOSname());
				}
			}
		catch (OSException e)
			{
			System.out.println(e);
			}	
		catch (VersionException e)
			{
			System.out.println(e);
			}
		}
	
	public void buyContent(Content content)
		{
		if (content instanceof Game)
			{
			checkCompatibility((Game)content);
			}
		price = content.getPrice();
		System.out.println("The price is: $" + price);

		if (isPremium == true)
			{
			System.out.println("You are a premium member so you get a discount");
			price = content.getPrice() - (content.getPrice() * 0.1);
			System.out.println("The price you get to pay is $" + price);
			}
		try
			{
			if (balance < price) {
				throw new BalanceException(balance, price);
			}
			balance = balance - price;
			content.addDownload();
			Library.add(content);
			System.out.println(UserName + ", you have successfully bought " + content.getName());
			System.out.println("Your balance is now: $" + balance);
			}
		catch (BalanceException e)
			{
			System.out.println(e);
			}		
		}
	
	public void showContentBought()
		{
		for (int i = 0; i < Library.size(); i++)
			System.out.println(Library.get(i));
		}
	
	public String getUserID()
		{
		return UserID;
		}
}