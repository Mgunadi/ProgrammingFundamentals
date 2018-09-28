
public class Game extends Content{

	private boolean isMultiplayer;
	private OS os;
	private static Array String [] gametypes = String{"Pokemon", "Minecraft", "GTA"};
	
	public Game(String ID, String appName, String reviews, int downloads, double price, boolean isMultiplayer, OS os) {
		super(ID, appName, reviews, downloads, price);
		this.isMultiplayer = isMultiplayer;
		this.os = os;
	}

	public void getNoPlayers() {
		if (isMultiplayer) {
			System.out.println("This game is a multi-player");
		} else {
			System.out.println("This game is a single-player");
		}
	}
	
	public String getID() {
		return super.ID;
	}

	public double getPrice() {
		return super.price;
	}
	
	public void showContentItems() {
		System.out.println("The following are types of games available for purchase: \n1. Pokemon, \n2. Minecraft, \n3. Grand Theft Auto, \n4. Danceworld.");
		return gametypes.get()..appName.);
	}
}
