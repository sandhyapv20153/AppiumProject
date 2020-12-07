package scenarios;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebElement;
import Utility.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import pageobjects.*;


public class APIDemosDragAndDropTestCase{
	
	AndroidDriverNativeAppInitialization initObj;
	AndroidDriver androidDriver;
	APIDemosHomePagePO homePage;
	APIDemosViewPagePO viewPage;
	APIDemosDragDropPagePO dragdropPage;
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
		dragdropPage = new APIDemosDragDropPagePO(androidDriver);

		util = new Utilities(androidDriver);	
		
		tAction = new TouchAction(androidDriver);
	}
	

	@Test
	public void DragDropTest() {

			List viewPageList;
			Iterator viewPageListIterator;
			WebElement viewPageWebElement;
			
			util.waitUntilElementClickable(homePage.getViewsLocator());
			homePage.getViewsLocator().click();
			
			
			util.waitUntilElementClickable(viewPage.getDragDropLocator());
			viewPage.getDragDropLocator().click();
			
			
			util.waitUntilElementClickable(dragdropPage.getCircleLocators().get(0));
			WebElement source = dragdropPage.getCircleLocators().get(0);
			WebElement destination = dragdropPage.getCircleLocators().get(1);
			
			tAction.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		
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
