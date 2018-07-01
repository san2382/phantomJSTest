package setup;


public class FindOS {
	
	public static String getOSName() {
		String OSProperty = System.getProperty("os.name");
		if (OSProperty.toLowerCase().contains("mac os")) {
			return Constants.MAC;
		} else if (OSProperty.toLowerCase().contains("windows")) {
			return Constants.WINDOWS;
		} else {
			return Constants.LINUX;
		}
	}


}
