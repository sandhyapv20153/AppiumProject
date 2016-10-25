package scenarios;

import static org.junit.Assert.*;


import java.net.MalformedURLException;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.*;
import io.appium.java_client.android.AndroidDriver;
import pageobjects.*;
import setup.TestSetUp;

public class LoginTestCases extends TestSetUp{
	
	AndroidDriver driver;
	WebElement element;
	
	@Before
	public void beforeClass()
	{
	
		driver = driverNativeAppTestSetup();

	}

	@Test
	public void test() {

		try {
			BMSHomePagePO hPage= new BMSHomePagePO(driver);
			BMSLoginOptionsPagePO loPage= new BMSLoginOptionsPagePO(driver);
			BMSSignUpPagePO suPage = new BMSSignUpPagePO(driver);
			Utilities util = new Utilities(driver);			
			util.waitUntilElementClickable(hPage.getLoginButtonLocator());
			hPage.getLoginButtonLocator().click();
			util.waitUntilElementClickable(loPage.getSignUpOptionLocator());
			loPage.getSignUpOptionLocator().click();
			util.waitUntilElementClickable(suPage.setFirstNameLocator());
			element =suPage.setFirstNameLocator();
			element.clear();
			element.sendKeys("FirstName");
			driver.closeApp();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void afterClass()
	{
		
	}

}
