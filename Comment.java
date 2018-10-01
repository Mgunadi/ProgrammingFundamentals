import java.util.ArrayList;
public class Comment {

	private User user;
	private ArrayList<String> thread = new ArrayList<String>();
	
	public Comment(User user, String comment) {
		this.user = user;
		thread.add(comment);
		
	}
	public Comment(User user, ArrayList<String> thread) {
		
		this.user = user;
		this.thread = thread;
	}
	
	public void addReply(String reply) {

		thread.add(reply); 	
		
	}
	
	public String getUser() {
		
	// create an accessor in the User class to get the User id:	return user.getUserID();
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
