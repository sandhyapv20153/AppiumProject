package scenarios;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import Utility.AndroidDriverNativeAppInitialization;
import Utility.Utilities;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;
import pageobjects.*;


public class APIDemosToggleTestCase {

	AndroidDriverNativeAppInitialization initObj;
	AndroidDriver androidDriver;
	APIDemosHomePagePO homePage;
	APIDemosViewPagePO viewPage;
	APIDemosSwitchesPagePO switchesPage;
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
		switchesPage = new APIDemosSwitchesPagePO(androidDriver);
		
		tAction = new TouchAction(androidDriver);

		util = new Utilities(androidDriver);	
	}
	
	
	@Test
	public void ToggleTest() {

			
			util.waitUntilElementClickable(homePage.getViewsLocator());
			homePage.getViewsLocator().click();
			
			viewPage.scrollToSwitchesLocator();
			viewPage.getSwitchesLocator().click();
			
			switchesPage.getMonitoredSwitchLocator().click();
			switchesPage.getDefaultSwitchLocator().click();
			switchesPage.getMonitoredSwitchLocator().click();
			switchesPage.getDefaultSwitchLocator().click();
			
			/*Point point1=switchesPage.getStandaloneSwitchLocator().getLocation();
			System.out.println(point1.x);
			System.out.println(point1.y);
			tAction.tap(PointOption.point(point1.x, point1.y)).perform();*/

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
