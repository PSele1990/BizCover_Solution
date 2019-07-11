package generic;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.ITestResult;
//import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_Const{
	

	public WebDriver driver;
	
	static
	{
	
		System.setProperty(CHROME_key, CHROME_value);
	}
			
	
	@BeforeMethod
	public void OpenAppln() 
	{
		
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com");
	}
	
	@AfterMethod
	public void CloseApp(ITestResult r) throws IOException
	{
		int status =r.getStatus();
		if(status==1)
		{
			Screenshot.CaptureScreenshot(driver);
		}
		else
		{
			Screenshot.CaptureScreenshot(driver);
		}
	driver.quit();
	} 
}

	

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       

