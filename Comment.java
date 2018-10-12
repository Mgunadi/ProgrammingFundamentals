import java.util.*;

public class Comment
	{

	private User user;
	private String text;
	private String Ustring;
	private String Utext;
	private ArrayList<String[]> replies = new ArrayList<String[]>();

	
	public Comment(User user, String text)
		{
		this.user = user;
		this.text = text;
		Ustring = user.getUserName();
		Utext = text;
		String[] utext = {Ustring, Utext};
		replies.add(utext);

		//replies.put(user, this); hashmap equivalent
		}
	
	
	public void addReply(Comment comt)
		{
		user = comt.getU();
		Ustring = user.getUserName();
		Utext = comt.getText();
		String[] utext = {Ustring, Utext};
		replies.add(utext);

		
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
	
	public void getThread()
		{
		for(String[] Utextarray : replies)
			{
			if (replies.size() > 0)
				{
				System.out.println(Utextarray[0] + Utextarray[1]);
				}
			}
		}
	
	public ArrayList<String[]> getReplies()
		{
		return replies;
		}
}
