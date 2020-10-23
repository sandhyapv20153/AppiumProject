package scenarios;

import java.util.Iterator;
import java.util.List;

import org.junit.*;
import org.openqa.selenium.WebElement;
import Utility.*;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
import pageobjects.*;


public class APIDemosButtonTestCase{
	
	AndroidDriverNativeAppInitialization initObj;
	AndroidDriver androidDriver;
	
	@Before
	public void beforeClass()
	{
	}

	@Test
	public void buttonTest() {

		initObj = new AndroidDriverNativeAppInitialization();
		androidDriver = initObj.getDriverValue();
	  	System.out.println("After initialization.....");
		
			APIDemosHomePagePO homePage= new APIDemosHomePagePO(androidDriver);
			APIDemosViewPagePO viewPage= new APIDemosViewPagePO(androidDriver);
			APIDemosButtonsPagePO buttonPage= new APIDemosButtonsPagePO(androidDriver);

			Utilities util = new Utilities(androidDriver);	
			
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
			
			//util.deviceBack();
			//util.deviceBack();
			
			androidDriver.closeApp();
			initObj.closeApp();
			
			
			

	}
	
	@After
	public void afterClass()
	{
	
	}

}
