package pageobjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.AppiumDriverBuilder;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosHomePagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosHomePagePO(AndroidDriver driver) throws MalformedURLException
	{
		this.driver = driver;
	}
	
	public WebElement getAccessibilityLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']"));
		return elem;
	}
	
	public WebElement getAnimationLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Animation']"));
		return elem;
	}
	
	public WebElement getAppLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='App']"));
		return elem;
	}
	
	public WebElement getContentLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Content']"));
		return elem;
	}
	
	public WebElement getGraphicsLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Graphics']"));
		return elem;
	}
	
	public WebElement getHardwareLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Hardware']"));
		return elem;
	}
	
	public WebElement getMediaLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Media']"));
		return elem;
	}
	
	public WebElement getNFCLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='NFC']"));
		return elem;
	}
	
	public WebElement getOSLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='OS']"));
		return elem;
	}
	
	public WebElement getPreferenceLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"));
		return elem;
	}
	
	public WebElement getSecurityLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Security']"));
		return elem;
	}
	
	public WebElement getViewsLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));
		return elem;
	}
	
	
}


