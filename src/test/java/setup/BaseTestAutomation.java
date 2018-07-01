package setup;

import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



	public class BaseTestAutomation {

		protected WebDriver driver;

		private DesiredCapabilities capability = null;

		/*

		public static String authkey = "";
		private StringBuffer logger ;
		protected String url = System.getenv("UI_SERVICE_URL");
		protected String urg = System.getenv("URG_SERVICE_URL");
		protected String username = System.getenv("SERVICE_USERNAME");
		protected String password = System.getenv("SERVICE_PASSWORD");
		protected String browser = System.getenv("BROWSER");
		protected String api = System.getenv("API");
		protected String apiVersion = System.getenv("VERSION");
		*/

		/**
		 * 
		 */
		public BaseTestAutomation() {
			
		}

		
		
		
		@BeforeClass
		public void setup() {
			
			//driver.manage().deleteAllCookies();

			LoadDrivers.loadDrivers();
			// Initiate PhantomJSDriver.
			driver = new PhantomJSDriver();	

			driver.get("http://www.yahoo.com");  
			driver.manage().window().maximize();
		}
		
		@AfterClass
		public void tearDown() {
			
			
			driver.quit();
					}

}
