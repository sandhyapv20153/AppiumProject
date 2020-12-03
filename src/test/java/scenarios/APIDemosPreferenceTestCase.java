package scenarios;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.AndroidDriverNativeAppInitialization;
import Utility.Utilities;
import io.appium.java_client.android.AndroidDriver;
import pageobjects.*;


public class APIDemosPreferenceTestCase {
	
	AndroidDriverNativeAppInitialization initObj;
	AndroidDriver androidDriver;
	APIDemosHomePagePO homePage;
	APIDemosPreferencePagePO preferencePage;
	APIDemosPreferenceDependencyPagePO preferenceDependencyPage;
	Utilities util;
	
	@Before
	public void beforeClass()
	{
		initObj = new AndroidDriverNativeAppInitialization();
		androidDriver = initObj.getDriverValue();
		androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	System.out.println("After initialization.....");
		
		homePage= new APIDemosHomePagePO(androidDriver);
		preferencePage = new APIDemosPreferencePagePO(androidDriver);

		util = new Utilities(androidDriver);	
	}

	@Test
	public void test() {
		
		homePage.getPreferenceLocator().click();		
		preferencePage.getPreferenceDependencyLocator().click();
		preferenceDependencyPage.getWifiCheckboxLocator().click();
		preferenceDependencyPage.getWifiSettingsLocator().click();
		preferenceDependencyPage.getTextBoxLocator().sendKeys("Hello");
		preferenceDependencyPage.getButtonLocator().get(1).click();
	}
	
	
	@After
	public void afterClass()
	{
		androidDriver.closeApp();
		initObj.closeApp();
	
	}

}
