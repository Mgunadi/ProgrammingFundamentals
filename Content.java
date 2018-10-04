import java.util.ArrayList;
import java.util.HashMap;
abstract public class Content {
	
	protected String ID, appName;
	protected int downloads;
	protected double price;
	protected ArrayList<Comment> Reviews = new ArrayList<Comment>();
	// private HashMap<String, ArrayList<String>> Reviews = new HashMap<String, ArrayList<String>>();

	public Content(String ID, String appName, ArrayList<Comment> Reviews, int downloads, double price) {
		this.ID = ID;
		this.appName = appName;
		this.Reviews = Reviews;
		this.downloads = downloads;
		this.price = price;
	}
	public Content(String ID, String appName, double price) {
		this.ID = ID;
		this.appName = appName;
		Reviews = null;
		downloads = 0;
		this.price = price;
	}
	
	
	public void addReview(Comment comment) {
		Reviews.add(comment);
	}
	
	public void showReviews() {
		for (int i = 0 ; i <Reviews.size(); i++) {
			System.out.println(Reviews.get(i).getUser() + " : " + Reviews.get(i).getThread());   
		}
	}
	
	public double getPrice()
		{
		return price;
		}

	public String getID() {
		return ID;
	}
	
	public abstract void showContentItems();
	
	public abstract String getGenre();
	
	public int addDownload()
		{
		downloads += 1;
		return downloads;
		}
	
}
