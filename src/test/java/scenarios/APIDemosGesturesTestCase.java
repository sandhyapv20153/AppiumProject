package scenarios;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import Utility.AndroidDriverNativeAppInitialization;
import Utility.Utilities;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import pageobjects.*;


public class APIDemosGesturesTestCase {

	AndroidDriverNativeAppInitialization initObj;
	AndroidDriver androidDriver;
	APIDemosHomePagePO homePage;
	APIDemosViewPagePO viewPage;
	APIDemosAdaptorPagePO adaptorPage;
	APIDemosNamesPagePO namesPage;
	TouchAction tAction;
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
		adaptorPage = new APIDemosAdaptorPagePO(androidDriver);
		namesPage = new APIDemosNamesPagePO(androidDriver);
		
		tAction = new TouchAction(androidDriver);

		util = new Utilities(androidDriver);	
	}
	
	@Test
	public void GestureTest() {

			
			List viewPageList;
			Iterator viewPageListIterator;
			WebElement viewPageWebElement;
			
			
			util.waitUntilElementClickable(homePage.getViewsLocator());
			homePage.getViewsLocator().click();
			
			
			util.waitUntilElementClickable(viewPage.getGalaryLocator());
			viewPageList = viewPage.getViewPageLocators();
			viewPageListIterator = viewPageList.iterator();
			while(viewPageListIterator.hasNext())
			{
				viewPageWebElement =(WebElement) viewPageListIterator.next();
				if(viewPageWebElement.getText().equals("Expandable Lists"))
				{
					System.out.println(viewPageWebElement.getText());
					viewPageWebElement.click();
					break;
				}
			}
			
		
			tAction.tap(tapOptions().withElement(element(adaptorPage.getCustomAdaptorLocator()))).perform();
			
			//tAction.tap(tapOptions().withElement(element(namesPage.getPeopleNameLocator()))).perform();
			tAction.longPress(longPressOptions().withElement(element(namesPage.getPeopleNameLocator())).withDuration(ofSeconds(2))).release().perform();
			util.waitUntilElementClickable(namesPage.getSampleActionLocator());
			assertEquals("Sample menu", namesPage.getSampleMenuLocator().getText());
			
			util.deviceBack();
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
