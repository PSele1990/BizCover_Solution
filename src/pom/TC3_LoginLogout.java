package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import generic.Base_Page;

public class TC3_LoginLogout extends Base_Page {
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement Login;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement SignIn;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement Logout;
	
	public TC3_LoginLogout(WebDriver driver)
	{
		super(driver);
	}
	
	public void VerifyhomeTitle()
	{
		
		VerifyTitle("My Store");
	}
	public void Login()
	{
		Login.click();
	}

	public void Email()
	{
		Email.sendKeys("Selenium81@gmail.com");
		
		
	}
	
	public void Password()
	{
		Password.sendKeys("Test@1234");
	}
	
	public void SignIn()
	{
		SignIn.click();
	}
	public void VerifyLoginPageTitle()
	{
		 VerifyTitle("My account - My Store");
		
	}	
	public void Logout()
	{
		Logout.click();
	}
}
