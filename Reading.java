import java.util.ArrayList;
abstract public class Reading extends Content{
	
	private int pages;
	private String genre, publisher;
	
	
	public Reading(String ID, String appName, double price, String genre, String publisher, int pages) {
		super(ID, appName, price);
		this.pages = pages;
		this.genre = genre;
		this.publisher = publisher;
		Reviews = new ArrayList<Comment>();
		downloads = 0;
	}


	public String getGenre() {
		return genre;	
	}
	
}
