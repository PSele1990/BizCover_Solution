package pom;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;


public class TC1_HomePage extends Base_Page{
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement SignIn;
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement EmailAdd;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement CreateAcc;
	
	
	
	
	public TC1_HomePage(WebDriver driver)
	{
		super(driver);
	}
	public void VerifyhomeTitle()
	{
		
		VerifyTitle("My Store");
	}
	public void SignIn()
	{
		SignIn.click();
	}

	public void EmailAdd()
	{
		EmailAdd.click();
		Random randomGenerator= new Random();
		int randomInt = randomGenerator.nextInt(500);
		EmailAdd.sendKeys("Selenium"+ randomInt +"@gmail.com");
	}
	public void VerifyRegisterTitle()
	{
		
		VerifyTitle("Login - My Store");
	}
	public void CreateAcc()
	{
		CreateAcc.click();
	}
}
