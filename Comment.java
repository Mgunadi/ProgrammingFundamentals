import java.util.ArrayList;
public class Comment {

	private User user;
	private String text;
	private ArrayList<Comment> thread = new ArrayList<Comment>();
	
	public Comment(User user, String text, ArrayList<Comment> thread) {
		
		this.user = user;
		this.text = text;
		this.thread = thread;
	}
	
	public void addReply(Comment com) {
		//this.Collection.add(com);
	}
	
	public void showReview(Content content) {
		// print out reviews of that content.
	}
}
