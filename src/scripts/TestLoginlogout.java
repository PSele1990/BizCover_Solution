package scripts;


import java.io.IOException;

import org.testng.annotations.Test;


import generic.Base_Test;
import generic.Screenshot;
import pom.TC3_LoginLogout;


public class TestLoginlogout extends Base_Test {
	
	@Test(priority=2)
	public void testmyAccountpage() throws InterruptedException, IOException
	{
		TC3_LoginLogout lp= new TC3_LoginLogout(driver);
		lp.VerifyhomeTitle();
		Screenshot.CaptureScreenshot(driver);
		lp.Login();
		lp.Email();
		lp.Password();
		Thread.sleep(5000);
		Screenshot.CaptureScreenshot(driver);
		lp.SignIn();
		Thread.sleep(5000);
		lp.VerifyLoginPageTitle();
		lp.Logout();
		
		
	}

}
