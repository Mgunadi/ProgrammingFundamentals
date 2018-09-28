import java.util.ArrayList;
import java.util.HashMap;
public class Content {
	
	private String ID, appName, reviews;
	private int downloads;
	private double price;
	private ArrayList<Comment> Reviews = new ArrayList<Comment>();
	// private HashMap<String, ArrayList<String>> Reviews = new HashMap<String, ArrayList<String>>();

	
	public Content(String ID, String appName, String reviews, int downloads, double price) {
		this.ID = ID;
		this.appName = appName;
		this.reviews = reviews;
		this.downloads = downloads;
		this.price = price;
	}
	public void addReview(Comment comment) {
		Reviews.add(comment);
		
	}
	
	public void showReview() {
		for (int i = 0 ; i <Reviews.size(); i++) {
			System.out.println(Reviews.get(i).getUser() + " : " + Reviews.get(i).getThread());   
		}
	}
	
	public double getPrice() {
		return price;
	}

}

//new comment by Verity
