package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Screenshot;
import pom.TC1_HomePage;
import pom.TC2_RegisterPage;

public class TestRegisterPage extends Base_Test{
	
	@Test(priority=1)
	public void testHomepage() throws InterruptedException, IOException
	{
		TC1_HomePage hp= new TC1_HomePage(driver);
		hp.VerifyhomeTitle();
		Screenshot.CaptureScreenshot(driver);
		hp.SignIn();
		hp.EmailAdd();
		hp.VerifyRegisterTitle();
		Screenshot.CaptureScreenshot(driver);
		hp.CreateAcc();
		Thread.sleep(5000);
		
		
		TC2_RegisterPage rp= new TC2_RegisterPage(driver);
		rp.VerifyRegformpageTitle();
		rp.Title();
		rp.Fname();
		rp.Lname();
		rp.Email();
		Thread.sleep(2000);
		rp.Password();
		rp.Firstname();
		rp.Lastname();
		rp.Address1();
		rp.City();
		rp.State();
		rp.Zipcode();
		rp.Mobile();
		rp.Register();
		Screenshot.CaptureScreenshot(driver);
		Thread.sleep(2000);
		rp.VerifyAccountpageTitle();
		Screenshot.CaptureScreenshot(driver);
	}

}

