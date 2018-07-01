package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	// Get yahoo search text box element.	
	@FindBy(id ="uh-search-box")
	private WebElement searchBox;
	
	// Get yahoo search box submit element.
	@FindBy(id="uh-search-button")
	private WebElement submitBtn;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSearchBtn() {
		if(submitBtn!=null)
		{
			submitBtn.click();
			System.out.println("Submit search form success.");
		}
	}
		
	public void enterTestinSearchBox(String textToSearch) {
				// Set search keyword.
				if(searchBox!=null)
				{
					searchBox.sendKeys(textToSearch);
					System.out.println("Input search keyword success.");
				}
	}	
				
								// Click submit button.
				
				
}
