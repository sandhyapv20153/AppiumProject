package scenarios;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebElement;
import Utility.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.android.AndroidKeyCode;
import pageobjects.*;


public class APIDemosMiscellaneousTestCase{
	
	AndroidDriverNativeAppInitialization initObj;
	AndroidDriver androidDriver;
	Utilities util;
	
	@Before
	public void beforeClass()
	{
		initObj = new AndroidDriverNativeAppInitialization();
		androidDriver = initObj.getDriverValue();
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	System.out.println("After initialization.....");
		
		util = new Utilities(androidDriver);	
	}
	

	@Test
	public void miscellaneousTest() {

		System.out.println(androidDriver.currentActivity());	
		System.out.println(androidDriver.getContext());//views-Native, Hybrid,Web
		System.out.println(androidDriver.getOrientation());//landscape or portrait
		androidDriver.getKeyboard();
		androidDriver.hideKeyboard();
		androidDriver.pressKey(new KeyEvent().withKey(AndroidKey.HOME));

	}
	
	@After
	public void afterClass()
	{
		androidDriver.closeApp();
		initObj.closeApp();
	
	}

}
