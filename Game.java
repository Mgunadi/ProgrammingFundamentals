import java.util.ArrayList;
public class Game extends Content{

	private boolean isMultiplayer;
	private OS os;
	private static String genreTypes[] = {"Pokemon", "Minecraft", "GTA", "Danceworld"};
	private static String genre = "Game";
	
	
	public Game(String ID, String appName, double price, boolean isMultiplayer, OS os) {
		super(ID, appName, price);
		this.isMultiplayer = isMultiplayer;
		this.os = os;
		Reviews = null;
		downloads = 0;
	}
	
	public Game(String ID, String appName, ArrayList<Comment> Reviews, int downloads, double price, boolean isMultiplayer, OS os) {
		super(ID, appName, Reviews, downloads, price);
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
		for (int i=0; i < genreTypes.length; i++) {
				System.out.println(genreTypes[i]);
		} 	
	}
	
	public String getGenre() {
		return genre;
	}
}