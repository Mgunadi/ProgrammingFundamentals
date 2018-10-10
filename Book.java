import java.util.ArrayList; 
public class Book extends Reading{

	private String[] author;
	
	public Book(String ID, String appName, double price,  String publisher, String genre, int pages, String [] author) {
		super(ID, appName, price, genre, publisher, pages);
		this.author = author;
		Reviews = new ArrayList<Comment>();
	}
	
/*	public Book(String ID, String appName, ArrayList<Comment> Reviews, int downloads, double price,  String publisher, String genre, int pages, String [] author) {
		super(ID, appName, Reviews, downloads, price, genre, publisher, pages);
		this.author = author;
	}
*/	
	public void showContent(PlayStore store) {
		for(String currentKey : store.Library.keySet()) {
			if (store.Library.get(currentKey) instanceof Book) {
				System.out.println(((Book)store.Library.get(currentKey)));
			}
		}
	}
	
}
