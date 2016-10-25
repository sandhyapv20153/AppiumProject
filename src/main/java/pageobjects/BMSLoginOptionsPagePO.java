package pageobjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.AppiumDriverBuilder;
import io.appium.java_client.android.AndroidDriver;

public class BMSLoginOptionsPagePO{
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public BMSLoginOptionsPagePO(AndroidDriver driver) throws MalformedURLException
	{
		this.driver = driver;
	}
	
	public WebElement getLoginWithFacBookOptionLocator(){
		elem = driver.findElement(By.id("com.bt.bms:id/imgFConnect"));
		return elem;
	}
	
	public WebElement getLoginWithGmailOptionLocator()
	{
		elem = driver.findElement(By.id("com.bt.bms:id/imgGPConnect"));
		return elem;
	}
	
	public WebElement getLoginWithEmailOptionLocator()
	{
		elem = driver.findElement(By.id("com.bt.bms:id/btnLogin"));
		return elem;
	}
	
	public WebElement getSignUpOptionLocator()
	{
		elem = driver.findElement(By.id("com.bt.bms:id/btnSignUp"));
		return elem;
	}
	

}


