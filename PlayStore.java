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
	
	//Uses subclass casting to get the appropriate subclass of an input genre. Only books and magazine have genre, so cast for Book or Magazine only.
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
	
	//Iterate through library of store contents to show items in the store.
	public void showContent() {
		System.out.println("This collection contains: ");
		for (String currentKey : library.keySet()) {
			System.out.println(library.get(currentKey).getName()); 
		}	
	}
	
	//Show games available by checking if content in store is a game using instanceof
	public void showGameContent() {
		System.out.println("Now showing collection of games:");
		for (String currentKey : library.keySet()) {
			if (library.get(currentKey) instanceof Game) {
				System.out.println(library.get(currentKey).getName());
			}
		}
	}
}