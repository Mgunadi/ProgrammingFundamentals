import java.util.*;
public class Comment {
	
	private User user;
	private String text;
	public HashMap<String, String> replies;
	
	public Comment(User user, String text) {
		this.user = user;
		this.text = text;
		replies = new HashMap<String, String>();
		replies.put(user.getUserID(), text);
	}
	
	
	/*public void addReply(Comment comt)
		{
		//this.user = comt.user;
		//this.text = comt.text;
		this.replies.put(comt.user, comt.text);
		}
	*/
	
	public void addReply(Comment comt) {
		//this.user = comt.user;
		//this.text = comt.text;
		String oldValue = replies.get(comt.user.getUserID());
		if (oldValue == null) {
			replies.put(comt.user.getUserID(), comt.text);
		}
		else {
			replies.put(comt.user.getUserID() + "1", comt.text);
		}
	}
  
  
	public User getU() {
		return user;
	}
	
	
	public String getUser() {
		return user.getUserID();
	}
	
  
	public String getText() {
		return text;
	}
	
	public void getThread() {
		System.out.println("within get thread");
		for(String currentKey : replies.keySet()) {
			if (replies.size() > 0) {
				System.out.println(replies.size());
				//System.out.println(replies.get(currentKey).getU() + " " + replies.get(currentKey).getText());
				System.out.println(replies.get(currentKey));
			}
		}
	}
	
  
  public HashMap<String, String> getReplies() {
	  return this.replies;
  }
  
}
