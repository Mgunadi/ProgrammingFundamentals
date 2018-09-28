import java.util.ArrayList;
public class Comment {

	private User user;
	//private String text;
	private ArrayList<String> thread = new ArrayList<String>();
	
	public Comment(User user, ArrayList<String> thread) {
		
		this.user = user;
		this.thread = thread;
	}
	
	public void addReply(String reply) {

		thread.add(reply); 	
		
	}
}
