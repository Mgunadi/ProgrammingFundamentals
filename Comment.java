import java.util.*;
public class Comment {

	private User user;
	private String text;
	public HashMap<User, Comment> replies;
	
	public Comment(User user, String text) {
		this.user = user;
		this.text = text;
		
		replies = new HashMap<User, Comment>();
		replies.put(user, this);
		System.out.println("Comment constructor");
	}
	
	
	public void addReply(Comment comt) {
		//this.user = comt.user;
		//this.text = comt.text;
		replies.put(comt.user, comt);
		System.out.println("addReply worked");
		
	}
	
	
	public String getUser() {
		return user.getUserID();
	}
	
	public String getText() {
		return text;
	}
	
	public void getThread() {
		System.out.println("getThread started");
		for(User currentKey : replies.keySet()) {
			if (replies.size() > 0) {
				System.out.println(replies.get(currentKey).getText());
			}
		}
		System.out.println("getThread worked");
	}
	
	public HashMap<User, Comment> getReplies(){
		return replies;
	}
	
}
