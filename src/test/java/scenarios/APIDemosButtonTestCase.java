package scenarios;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebElement;
import Utility.*;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
import pageobjects.*;


public class APIDemosButtonTestCase{
	
	AndroidDriverNativeAppInitialization initObj;
	AndroidDriver androidDriver;
	APIDemosHomePagePO homePage;
	APIDemosViewPagePO viewPage;
	APIDemosButtonsPagePO buttonPage;
	Utilities util;
	
	@Before
	public void beforeClass()
	{
		initObj = new AndroidDriverNativeAppInitialization();
		androidDriver = initObj.getDriverValue();
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	System.out.println("After initialization.....");
		
		homePage= new APIDemosHomePagePO(androidDriver);
		viewPage= new APIDemosViewPagePO(androidDriver);
		buttonPage= new APIDemosButtonsPagePO(androidDriver);

		util = new Utilities(androidDriver);	
	}
	

	@Test
	public void buttonTest() {

			
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
			

	}
	
	@After
	public void afterClass()
	{
		androidDriver.closeApp();
		initObj.closeApp();
	
	}

}
