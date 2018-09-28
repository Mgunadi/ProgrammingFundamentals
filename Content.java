import java.util.ArrayList;
import java.util.HashMap;
abstract public class Content {
	
	protected String ID, appName, reviews;
	private int downloads;
	protected double price;
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
	
	public abstract double getPrice();

	public abstract String getID();
	
	public abstract String showContentItems();
	
}
