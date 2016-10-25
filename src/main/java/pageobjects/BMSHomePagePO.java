package pageobjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.AppiumDriverBuilder;
import io.appium.java_client.android.AndroidDriver;

public class BMSHomePagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public BMSHomePagePO(AndroidDriver driver) throws MalformedURLException
	{
		this.driver = driver;
	}
	
	public WebElement getLoginButtonLocator(){
		elem = driver.findElement(By.id("com.bt.bms:id/btnLogin"));
		return elem;
	}
	
	public WebElement getSkipButtonLocator()
	{
		elem = driver.findElement(By.id("com.bt.bms:id/btnNoThanks"));
		return elem;
	}
	

}


