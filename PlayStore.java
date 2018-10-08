import java.util.*;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class PlayStore {
	
	//private static ReadingList = 
	private String id;
	public HashMap<String, Content> Library = new HashMap<String, Content>();
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
	
		for(String currentKey : Library.keySet()) {
			if (Library.get(currentKey) instanceof Book) {
				if (((Book)Library.get(currentKey)).getGenre().equals(genre)) {
					System.out.println(((Book)Library.get(currentKey)).getClass().getName());
				} 
			} else if (Library.get(currentKey) instanceof Magazine) {
				if (((Magazine)Library.get(currentKey)).getGenre().equals(genre)) {
					System.out.println(((Magazine)Library.get(currentKey)).getClass().getName());
				}
			}
		}
	}
	
	public void showContent() {
		System.out.println("This collection contains: ");
		for (String currentKey : Library.keySet()) {
			System.out.println(Library.get(currentKey).getName()); 
		}	
	}
}