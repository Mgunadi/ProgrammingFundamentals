import java.util.*;

public class Comment {

	private User user;
	private String text;
	//private String userString;
	//private String userText;
	public static int counter = 0;
	private ArrayList<Comment> replies = new ArrayList<>();

	
	public Comment(User user, String text) {
		this.user = user;
		this.text = text;
		replies.add(this);
		counter += 1;
	}
	
	
	public void addReply(Comment comt) {
		System.out.println(comt.getText());
		System.out.println(comt);
		replies.add(comt);
		counter += 1;
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
	
	
	public Comment getThread(int n) {
		if (n ==1) 
			return replies.get(0);
		else 
			return replies.get(0).getReplies().get(0).getThread(0);
	
	}
	
	
	public ArrayList<Comment> getReplies() {
		return replies;
	}
	
}
