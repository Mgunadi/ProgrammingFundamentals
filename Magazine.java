
public class Magazine extends Reading{

	private String magName;
	private String genre = "cooking";
	
	public Magazine(String ID, String appName, String reviews, int downloads, double price, String genre, String publisher, int pages, String magName) {
		super(ID, appName, reviews, downloads, price, genre, publisher, pages);
		this.magName = magName;
		
	}
	
	public String getGenre(){
		return genre;
	}


}
