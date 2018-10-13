import java.util.ArrayList; 

public class Book extends Reading {

	private String[] author;
	
	public Book(String ID, String appName, double price,  String publisher, String genre, int pages, String [] author) {
		super(ID, appName, price, genre, publisher, pages);
		this.author = author;
		Reviews = new ArrayList<Comment>();
	}
	
	
	public void showContent(PlayStore store) {
		for(String currentKey : store.Library.keySet()) {
			if (store.Library.get(currentKey) instanceof Book) {
				System.out.println(((Book)store.Library.get(currentKey)));
			}
		}
	}
	
}
