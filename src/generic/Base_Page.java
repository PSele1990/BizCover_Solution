package generic;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Base_Page {

	
	public WebDriver driver;

	public  Base_Page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyTitle(String title)
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title matching = "+title, true);
		
			System.out.println(title);
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching",true);
			Assert.fail();
		}
					
	}
public void VerifyElement(WebElement ele)
{
	WebDriverWait wait= new WebDriverWait(driver,10);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(ele));
		Reporter.log("Element is matching", true);
	}
	catch(Exception e)
	{
		Reporter.log("element is not matching", true);
		Assert.fail();
	}


}
}

