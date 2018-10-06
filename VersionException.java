
public class VersionException extends Exception{
	
	
	private OS osUser, osGame;
	
	public VersionException(OS osUser, OS osGame)
		{
		super("Please update your operating system to at least " + osGame);
		}
}