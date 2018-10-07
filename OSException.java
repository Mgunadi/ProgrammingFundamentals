
public class OSException extends Exception{
	
	
	private String osGame, osUser;
	
	public OSException(String osUser, String osGame)
		{
		super("Your current operating system is " + osUser + 
				"\n Please choose a version of the game that is compatible" + 
				"\n or choose an alternat version of the game");
		}
}