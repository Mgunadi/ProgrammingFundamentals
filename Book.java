import java.util.ArrayList; 
public class Book extends Reading{

	private String[] author;
	private String genre = "novel";
	
	public Book(String ID, String appName, double price,  String publisher, String genre, int pages, String [] author) {
		super(ID, appName, price, genre, publisher, pages);
		this.author = author;
	}
	
	public Book(String ID, String appName, ArrayList<Comment> Reviews, int downloads, double price,  String publisher, String genre, int pages, String [] author) {
		super(ID, appName, Reviews, downloads, price, genre, publisher, pages);
		this.author = author;
	}
	
	public String getGenre() {
		return genre;
	}
}
