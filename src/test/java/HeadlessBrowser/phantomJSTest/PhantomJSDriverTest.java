package HeadlessBrowser.phantomJSTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.searchResultPage;
import setup.BaseTestAutomation;

public class PhantomJSDriverTest extends BaseTestAutomation{

	 @Test
	 public void YahooTest() throws IOException, InterruptedException
	 {
			Thread.sleep(3000);      			
	        // Print out yahoo home page title.
			System.out.println("Page title is: " + driver.getTitle());	
			
			// Set search keyword.
			HomePage home = new HomePage(driver);
			// Click submit button.
			home.enterTestinSearchBox("selenium");
			Thread.sleep(3000);
			home.clickOnSearchBtn();
			
			Thread.sleep(3000);
			
			searchResultPage search = PageFactory.initElements(driver, searchResultPage.class);
			search.getResultElement();
			
	 }
	
}

