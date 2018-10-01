import java.util.ArrayList; 

public class Book extends Reading{

	private String[] author;
	private String genre = "novel";
	
	public Book(String ID, String appName, String reviews, int downloads, double price, String genre, String publisher, int pages, String [] author) {
		super(ID, appName, reviews, downloads, price, genre, publisher, pages);
		this.author = author;
	
	}
	
	public String getGenre() {
		return genre;
	}
}
