import java.util.ArrayList;
public class Magazine extends Reading{

	private String magName;
	
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
	
	public void showContent(PlayStore store) {
		for(String currentKey : store.Library.keySet()) {
			if (store.Library.get(currentKey) instanceof Magazine) {
				System.out.println(((Magazine)store.Library.get(currentKey)));
			}
		}
	}

}
