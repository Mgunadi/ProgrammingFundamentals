import java.util.*;

public class Comment {

	private User user;
	private String text;
	//private String userString;
	//private String userText;
	private ArrayList<Comment> replies = new ArrayList<>();

	
	public Comment(User user, String text) {
		this.user = user;
		this.text = text;
	}
	
	
	public void addReply(Comment comt) {
		System.out.println(comt.getText());
		System.out.println(comt);
		replies.add(comt);
		System.out.println("Added a comment");
	}

	
	public User getU() {
		return user;
	}
	
	
	public String getUser() {
		return user.getUserName();
	}
	
	
	public String getText() {
		return text;
	}
	
	
	public void getThread() {
		for(Comment Replies : replies) {
			if (replies.size() > 0) {
				System.out.println(replies.size());
				System.out.println(replies.get(0).getText());
			}
		}
	}
	
	
	public ArrayList<Comment> getReplies() {
		return replies;
	}
	
}
