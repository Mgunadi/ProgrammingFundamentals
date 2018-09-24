import java.util.HashMap;
public class Content {
	
	private String ID, appName, reviews;
	private int downloads;
	private double price;
	private HashMap<String, String> Reviews = new HashMap<String, String>();
	
	public Content(String ID, String appName, String reviews, int downloads, double price) {
		this.ID = ID;
		this.appName = appName;
		this.reviews = reviews;
		this.downloads = downloads;
		this.price = price;
	}
	public void addComment(Comment r) {
		Reviews.put(r.get(0));
		
	}
	
	public String showReview(String c) {
		for (int i = 0 ; i <Reviews.size(); i++) {
			return Reviews.get(i).get(key);  // gets the value, username, for the key, userid (eg. u1), 
		}
	}

}

##branch out 