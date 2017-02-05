package Utility;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Utilities {
	private AndroidDriver driver;
	private WebElement element;
	
	public Utilities(AndroidDriver driver) throws MalformedURLException
	{
		this.driver = driver;
	}
	
	public void waitUntilElementClickable(WebElement elem)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
	}
	
	public void waitUntilElementPresent(WebElement elem, String str)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.elementToBeClickable(elem));
		wait.until(ExpectedConditions.textToBePresentInElement(elem, str));
	}
	
	public void deviceBack()
	{
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}
	
	public void swipeInMilliSec()
	{
		//swiping - swiping in milliseconds ie., 3000 = 2milli seconds
		MobileElement SwipeElement = (MobileElement)driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Kochi']"));
		SwipeElement.swipe(SwipeElementDirection.UP, 3000);
	}
	
	

}
