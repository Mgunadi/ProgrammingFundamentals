import java.util.*;

public class Comment
	{

	private User user;
	private String text;
	private String Ustring;
	private String Utext;
	public int counter = 0;
	public static ArrayList<Comment> replies = new ArrayList<Comment>();

	
	public Comment(User user, String text)
		{
		this.user = user;
		this.text = text;
		//Ustring = user.getUserName();
		//Utext = text;
		//String[] utext = {Ustring, Utext};
		if (!replies.contains(this)) {
			replies.add(this);
		}
			counter = 1;
		//replies.put(user, this); hashmap equivalent
		}
	
	
	public void addReply(Comment comt)
		{
		user = comt.getU();
		//Ustring = user.getUserName();
		//Utext = comt.getText();
		//String[] utext = {Ustring, Utext};
		counter += 1;
		replies.add(comt);

		
		//this.user = comt.user;
		//this.text = comt.text;
		//this.replies.put(comt.user, comt);  hashmap equivalent
		
		}

	public User getU()
		{
		return user;
		}
	
	public String getUser()
		{
		return user.getUserID();
		}
	
	public String getText()
		{
		return text;
		}
	
	public void getThread() {
		for(Comment comm : replies){
			System.out.println(comm.getUser() + ": " + comm.getText());
		}
	}
	
	public ArrayList<Comment> getReplies()
		{
		return replies;
		}
}
