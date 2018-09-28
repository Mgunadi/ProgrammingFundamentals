import java.util.Hashtable;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class PlayStore {
	
	//private static ReadingList = 
	private String id;
	private HashMap<String, Content> Library = new HashMap<String, Content>();
	private ArrayList<User> UserList = new ArrayList<User>();
	
	public PlayStore() {
	}
	
	public void add(String id, Content content) {
		Library.put(id, content);
	}
	
	public void add(User user) {
		UserList.add(user);
	}
	
	public void showReadingOfGenre(String genre) {
		//yesReading =
		System.out.println(genre + "is a title in the category:" + Library.);
	}
	
	
	public void showContent() {
		System.out.println("This collection contains: " + Library.entrySet());
		for (int i = 0 ; i <Library.size(); i++) {
			System.out.println(Library.get(i).getClass()); 
		}
	}
	
}