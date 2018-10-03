import java.util.ArrayList;
public class Magazine extends Reading{

	private String magName;
	private String genre = "cooking";
	
	public Magazine(String ID, String appName, double price, String genre, String publisher, int pages, String magName) {
		super(ID, appName, price, genre, publisher, pages);
		this.magName = magName;
		Reviews = null;
		downloads = 0;
	}
	
	public Magazine(String ID, String appName, ArrayList<Comment> Reviews, int downloads, double price, String genre, String publisher, int pages, String magName) {
		super(ID, appName, Reviews, downloads, price, genre, publisher, pages);
		this.magName = magName;
	}
	
	public String getGenre(){
		return genre;
	}


}
