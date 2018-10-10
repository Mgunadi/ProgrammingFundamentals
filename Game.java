
import java.util.ArrayList;
public class Game extends Content{

	private boolean isMultiplayer;
	private OS os;
	
	public Game(String ID, String appName, double price, boolean isMultiplayer, OS os) {
		super(ID, appName, price);
		this.isMultiplayer = isMultiplayer;
		this.os = os;
		//Reviews = null;
		Reviews = new ArrayList<Comment>();
		downloads = 0;
	}
	
/*	public Game(String ID, String appName, ArrayList<Comment> Reviews, int downloads, double price, boolean isMultiplayer, OS os) {
		super(ID, appName, Reviews, downloads, price);
		this.isMultiplayer = isMultiplayer;
		this.os = os;
	}
*/
	public void getNoPlayers() {
		if (isMultiplayer) {
			System.out.println("This game is a multi-player");
		} else {
			System.out.println("This game is a single-player");
		}
	}
	
	public void showContent(PlayStore store) {
		for(String currentKey : store.Library.keySet()) {
			if (store.Library.get(currentKey) instanceof Game) {
				System.out.println(((Game)store.Library.get(currentKey)));
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
