package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class Utilities {
	private AndroidDriver driver;
	private WebElement element;
	public static MobileElement mobileElement;
	
	public Utilities(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public void waitUntilElementClickable(WebElement elem)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
	}
	
	public void waitUntilElementPresent(WebElement elem, String str)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.textToBePresentInElement(elem, str));
	}
	
	public void deviceBack()
	{
		
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	}
	
	/*public void swipeInMilliSec()
	{
		//swiping - swiping in milliseconds ie., 3000 = 2milli seconds
		MobileElement SwipeElement = (MobileElement)driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Kochi']"));
		SwipeElement.swipe(SwipeElementDirection.UP, 3000);
	}*/
	
	

	public static boolean waitForPresence(AndroidDriver driver, int timeLimitInSeconds, String targetResourceId)
	{

		boolean isElementPresent = false;
		try{
			mobileElement =  (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\""+targetResourceId+"\")");
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			isElementPresent = mobileElement.isDisplayed();
			return isElementPresent;	
		}catch(Exception e){
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		}
	}
	
	

}
