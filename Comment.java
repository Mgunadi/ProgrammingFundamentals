import java.util.*;

public class Comment {

	private User user;
	private String text;
	public int counter = 0;
	public static ArrayList<Comment> replies = new ArrayList<Comment>();

	
	public Comment(User user, String text) {
		this.user = user;
		this.text = text;
		if (!replies.contains(this)) {
			replies.add(this);
		}
			counter = 1;
	}
	
	
	public void addReply(Comment comt) {
		user = comt.getU();
		counter += 1;
		replies.add(comt);
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
		for(Comment comm : replies) {
			System.out.println(comm.getUser() + ": " + comm.getText());
		}
	}

	
	public ArrayList<Comment> getReplies() {
		return replies;
	}
	
}
