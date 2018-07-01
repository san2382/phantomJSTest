package setup;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class LoadDrivers {
	
	public static void loadDrivers() {

		String OSName = FindOS.getOSName();

		//String workingDir = System.getProperty("user.dir");
		//workingDir += "/lib/WebDrivers/";
		String phantomjsExeutableFilePath = "C:\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe";

		if (OSName.equalsIgnoreCase(Constants.MAC)) {
			// Load PhantomJS Driver for MAC OS
			System.setProperty("phantomjs.binary.path", phantomjsExeutableFilePath);		
		    
		} else if (OSName.equalsIgnoreCase(Constants.WINDOWS)) {
			//System.out.println(workingDir); // Load PhantomJS Driver for Windows
			System.setProperty("phantomjs.binary.path", phantomjsExeutableFilePath);		
		       
		}
	}

}
