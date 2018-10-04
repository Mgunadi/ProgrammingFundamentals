import java.util.ArrayList;
abstract public class Reading extends Content{
	
	private int pages;
	private String genre, publisher;
	
	public Reading(String ID, String appName, double price, String genre, String publisher, int pages) {
		super(ID, appName, price);
		this.pages = pages;
		this.genre = genre;
		this.publisher = publisher;
		Reviews = null;
		downloads = 0;
	}

	public Reading(String ID, String appName, ArrayList<Comment> Reviews, int downloads, double price, String genre, String publisher, int pages) {
		super(ID, appName, Reviews, downloads, price);
		this.pages = pages;
		this.genre = genre;
		this.publisher = publisher;
			
	}

	public String getGenre() {
		return genre;
		
	}
}
