package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import generic.Base_Page;

public class TC2_RegisterPage extends Base_Page {
	

	@FindBy(xpath="//input[@id='id_gender2']")
	private WebElement Title;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement Fname;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	private WebElement Lname;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@name='address1']")
	private WebElement Address1;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	
	@FindBy(xpath="//select[@name='id_state']")
	private WebElement State;
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement Zipcode;
	
	@FindBy(xpath="//input[@name='phone_mobile']")
	private WebElement Mobile;
	
	@FindBy(xpath="//button[@name='submitAccount']")
	private WebElement Register;
	
	public TC2_RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	public void VerifyRegformpageTitle()
	{
		
		VerifyTitle("Login - My Store");
	}
	public void Title()
	{
		Title.click();
	}
	
	public void Fname()
	{
		Fname.sendKeys("Selenium");
	}
	
	public void Lname()
	{
		Lname.sendKeys("test");
	}
	
	public void Email()
	{
	
		System.out.println(Email.getAttribute("value"));
	}
	
	public void Password()
	{
		Password.sendKeys("Test@1234");
	}
	
	public void Firstname()
	{
		Firstname.sendKeys("Selenium");
	}
	
	public void Lastname()
	{
		Lastname.sendKeys("test");
	}
	
	public void Address1()
	{
		Address1.sendKeys("ABC ltd , 123 PO Box");
	}
	
	public void City()
	{
		City.sendKeys("Manchester");
	}
	
	public void State()
	{
		State.click();
		Select s= new Select(State);
		s.selectByValue("32");
		
	}
	
	public void Zipcode()
	{
		Zipcode.sendKeys("98510");
	}
	public void Mobile()
	{
		Mobile.sendKeys("2356985557");
	}
	public void Register()
	{
		Register.click();
	}
	public void VerifyAccountpageTitle()
	{
		
		VerifyTitle("My account - My Store");
	}
}


