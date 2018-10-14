import java.util.ArrayList;

public class Game extends Content {

	private boolean isMultiplayer;
	private OS os;
	
	public Game(String ID, String appName, double price, boolean isMultiplayer, OS os) {
		super(ID, appName, price);
		this.isMultiplayer = isMultiplayer;
		this.os = os;
		Reviews = new ArrayList<Comment>();
		downloads = 0;
	}
	

	public void getNoPlayers() {
		if (isMultiplayer) {
			System.out.println("This game is a multi-player");
		} else {
			System.out.println("This game is a single-player");
		}
	}
	
	
	public void showContent(PlayStore store) {
		for(String currentKey : store.library.keySet()) {
			if (store.library.get(currentKey) instanceof Game) {
				System.out.println(((Game)store.library.get(currentKey)));
			}
		}
	}
	
	
	public String getOSname() {
		return os.getOSname();
	}
	
	
	public int getOSversion() {
		return os.getOSversion();
	}

}
