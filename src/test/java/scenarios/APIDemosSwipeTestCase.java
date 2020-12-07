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


public class APIDemosSwipeTestCase {

	AndroidDriverNativeAppInitialization initObj;
	AndroidDriver androidDriver;
	APIDemosHomePagePO homePage;
	APIDemosViewPagePO viewPage;
	APIDemosDateWidgetOptionPagePO dateOptionPage;
	APIDemosClockPagePO clockPage;
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
		dateOptionPage= new APIDemosDateWidgetOptionPagePO(androidDriver);
		clockPage = new APIDemosClockPagePO(androidDriver);
		
		tAction = new TouchAction(androidDriver);

		util = new Utilities(androidDriver);	
	}
	
	@Test
	public void SwipeTest() {

			
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
				if(viewPageWebElement.getText().equals("Date Widgets"))
				{
					System.out.println(viewPageWebElement.getText());
					viewPageWebElement.click();
					break;
				}
			}
			dateOptionPage.getInlineLocator().click();
			clockPage.getNineLocator().click();
			tAction.longPress(longPressOptions().withElement(element(clockPage.getMinute15Locator())).withDuration(ofSeconds(2))).moveTo(element(clockPage.getMinute45Locator())).release().perform();
			
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
