public class OS {

	private String OSname;
	private int version;
	
	public OS(String OSname, int version) {
		this.OSname = OSname;
		this.version = version;
	}
	
	public String getOSname() {
		return OSname;
	}
	
	public int getOSversion() {
		return version;
	}

}
