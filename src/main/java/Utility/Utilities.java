package Utility;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

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

}
