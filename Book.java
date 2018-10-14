import java.util.ArrayList; 

public class Book extends Reading {

	private String[] author;
	
	public Book(String id, String appName, double price,  String publisher, String genre, int pages, String [] author) {
		super(id, appName, price, genre, publisher, pages);
		this.author = author;
		Reviews = new ArrayList<Comment>();
	}
	
	public void showContent(PlayStore store) {
		for(String currentKey : store.library.keySet()) {
			if (store.library.get(currentKey) instanceof Book) {
				System.out.println(((Book)store.library.get(currentKey)));
			}
		}
	}
	
}
