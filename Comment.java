import java.util.*;

public class Comment {

	private User user;
	private String text;
	private String userString;
	private String userText;
	private ArrayList<String[]> replies = new ArrayList<String[]>();

	
	public Comment(User user, String text) {
		this.user = user;
		this.text = text;
		userString = user.getUserName();
		userText = text;
		String[] utext = {userString, userText};
		replies.add(utext);
	}
	
	
	public void addReply(Comment comt) {
		user = comt.getU();
		userString = user.getUserName();
		userText = comt.getText();
		String[] utext = {userString, userText};
		replies.add(utext);	
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
		for(String[] Utextarray : replies) {
			if (replies.size() > 0) {
				System.out.println(Utextarray[0] + ": " + Utextarray[1]);
			}
		}
	}
	
	
	public ArrayList<String[]> getReplies() {
		return replies;
	}
	
}
