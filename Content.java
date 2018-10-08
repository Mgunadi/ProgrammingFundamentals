import java.util.*;

abstract public class Content {
	
	protected String ID, appName;
	protected int downloads;
	protected double price;
	public ArrayList<Comment> Reviews; 

/*	public Content(String ID, String appName, ArrayList<Comment> Reviews, int downloads, double price) {
		this.ID = ID;
		this.appName = appName;
		this.Reviews = Reviews;
		this.downloads = downloads;
		this.price = price;
	}
*/
	public Content(String ID, String appName, double price)
		{
		this.ID = ID;
		this.appName = appName;
		Reviews = new ArrayList<Comment>();
		//Reviews = null;
		downloads = 0;
		this.price = price;
		}
	
	
	public void addReview(Comment com)
		{
		Reviews.add(new Comment(com.getU(), com.getText()));
		//Reviews.get(Reviews.indexOf(com)).addReply(com);
		}
	
	public void showReviews()
		{
		for (int i = 0 ; i <Reviews.size(); i++)
			{
			for (User replyKey : Reviews.get(i).getReplies().keySet())
				{
				//System.out.println(Reviews.get(i).getReplies().values());
				Reviews.get(i).getReplies().get(replyKey).getThread();
				}
			}
		}
	
	public double getPrice()
		{
		return price;
		}

	public String getID()
		{
		return ID;
		}
	
	public String getName()
		{
		return appName;
		}
	
	public int addDownload()
		{
		downloads += 1;
		return downloads;
		}

	public abstract void showContent(PlayStore store);
	
}
