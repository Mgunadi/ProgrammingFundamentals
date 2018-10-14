
public class VersionException extends Exception{
	
	
	private int osVersionUser, osVersionGame;
	
	public VersionException(int osVersionUser, int osVersionGame)
		{
		super("Your current operating system is version " + osVersionUser + 
				"\n Please update your operating system to at least version " + osVersionGame + 
				"\n or choose an alternat version of the game");

		}
}