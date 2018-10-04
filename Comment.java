import java.util.ArrayList;
public class Comment {

	private User user;
	private ArrayList<String> thread = new ArrayList<String>();
	
	public Comment(User user, String comment) {
		this.user = user;
		thread.add(comment);
		
	}
	
	public void addReply(Comment reply) {

		thread.add(reply.getThread()); 	
		
	}
	
	public String getUser() {
		
		return user.getUserID();
	
	}
	
	public String getThread() {
		
		for (int i = 0; i <thread.size(); i++) {
			if (thread.size() > 0) {
				return thread.get(i);
			}
		}
		return null;
	}
}
