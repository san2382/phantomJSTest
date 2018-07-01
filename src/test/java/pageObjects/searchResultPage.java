package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchResultPage {
	
	private WebDriver driver;
	
	// Get search result element list by xpath in search result page
	@FindBy(xpath = "//ol[@class='mb-15 reg searchCenterMiddle']//li")
	private List<WebElement> resultElementList;
	
	
	/*public searchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}*/
	
	public void getResultElement() {
				
				if(resultElementList!=null)
				{
					int size = resultElementList.size();
					System.out.println("Search result list size = " + size);
					// Loop the result list.
					for(int i=0;i<size;i++)
					{
						WebElement resultElement = resultElementList.get(i);
						
						try
						{
							// Get result item title element by xpath.
							By titleByXPath = By.xpath(".//a");
							WebElement titleELement = resultElement.findElement(titleByXPath);
							String title = "";
							if(titleELement!=null)
							{
								title = titleELement.getText();
							}
							
							if(!"".equals(title))
							{
								System.out.println("title = " + title);
							}
						}catch(NoSuchElementException ex)
						{
							ex.printStackTrace();
						}
						
						
					/*
						try
						{
							// Get result item description element by xpath.
							By descByXPath = By.xpath(".//div[@class='compText aAbs']");
							WebElement descElement = resultElement.findElement(descByXPath);
							String description = "";
							if(descElement!=null)
							{
								description = descElement.getText();
							}							
							if(!"".equals(description))
							{
								System.out.println("description = " + description);
								System.out.println();
							}
						}catch(NoSuchElementException ex)
						{
							ex.printStackTrace();
						}*/
					}
				}
				
		   
		}

}
