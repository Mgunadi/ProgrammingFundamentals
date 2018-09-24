import java.util.ArrayList;
public class Comment {

	private User user;
	private String cmt;
	private ArrayList<Comment> Collection = new ArrayList<Comment>();
	
	public Comment(User u, String cmt, ArrayList<Comment> clt) {
		user = u;
		this.cmt = cmt;
		Collection = clt;
	}
	
	public void addReply(Comment com) {
		this.Collection.add(com);
	}
	
}
