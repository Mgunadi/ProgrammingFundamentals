
abstract public class Reading extends Content{
	
	private int pages;
	private String genre, publisher;
	
	public Reading(String ID, String appName, String reviews, int downloads, double price, String genre, String publisher, int pages) {
		super(ID, appName, reviews, downloads, price);
		this.pages = pages;
		this.genre = genre;
		this.publisher = publisher;
	}

}
