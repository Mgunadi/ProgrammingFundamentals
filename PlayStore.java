import java.util.*;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class PlayStore {
	
	private String id;
	public HashMap<String, Content> library = new HashMap<String, Content>();
	private ArrayList<User> userList = new ArrayList<User>();
	
	
	public PlayStore(){
	}
	
	
	public void add(String id, Content content) {
		library.put(id, content);
	}
	
	
	public void add(User user) {
		userList.add(user);
	}
	
	
	public void showReadingOfGenre(String genre) {
		for(String currentKey : library.keySet()) {
			if (library.get(currentKey) instanceof Book) {
				if (((Book)library.get(currentKey)).getGenre().equals(genre)) {
					System.out.println(((Book)library.get(currentKey)).getClass().getName());
				} 
			} else if (library.get(currentKey) instanceof Magazine) {
				if (((Magazine)library.get(currentKey)).getGenre().equals(genre)) {
					System.out.println(((Magazine)library.get(currentKey)).getClass().getName());
				}
			}
		}
	}
	
	
	public void showContent() {
		System.out.println("This collection contains: ");
		for (String currentKey : library.keySet()) {
			System.out.println(library.get(currentKey).getName()); 
		}	
	}
	
}