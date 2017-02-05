package scenarios;

import static org.junit.Assert.*;


import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import pageobjects.*;
import setup.TestSetUp;

public class APIDemosButtonTestCase extends TestSetUp{
	
	AndroidDriver driver;
	WebElement element;
	
	@Before
	public void beforeClass()
	{
	
		driver = driverNativeAppTestSetup();

	}

	@Test
	public void buttonTest() {

		try {
			APIDemosHomePagePO homePage= new APIDemosHomePagePO(driver);
			APIDemosViewPagePO viewPage= new APIDemosViewPagePO(driver);
			APIDemosButtonsPagePO buttonPage= new APIDemosButtonsPagePO(driver);

			Utilities util = new Utilities(driver);	
			
			List viewPageList;
			Iterator viewPageListIterator;
			WebElement viewPageWebElement;
			
			
			util.waitUntilElementClickable(homePage.getViewsLocator());
			homePage.getViewsLocator().click();
			
			
			viewPageList = viewPage.getViewPageLocators();
			viewPageListIterator = viewPageList.iterator();
			while(viewPageListIterator.hasNext())
			{
				viewPageWebElement =(WebElement) viewPageListIterator.next();
				if(viewPageWebElement.getText().equals("Buttons"))
				{
					System.out.println(viewPageWebElement.getText());
					viewPageWebElement.click();
					break;
				}
			}
			util.waitUntilElementPresent(buttonPage.getOffButtonLocator(), "OFF");
			buttonPage.getOffButtonLocator().click();
			
			util.deviceBack();
			util.deviceBack();
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
