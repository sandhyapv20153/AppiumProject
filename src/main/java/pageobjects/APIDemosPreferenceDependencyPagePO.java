package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;


public class APIDemosPreferenceDependencyPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	WebDriverWait wait;
	
	public APIDemosPreferenceDependencyPagePO(AndroidDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,30);
	    waitForElement();
	}
	
	/*public WebElement getWifiCheckboxLocator(){
		elem = driver.findElementByXPath("//android.widget.TextView[@text='WiFi']");
		return elem;
	}*/
	
	public WebElement getWifiCheckboxLocator(){
		//elem = driver.findElementById("android:id/checkbox");
		elem = driver.findElementByAndroidUIAutomator("text(\"WiFi\")");
		return elem;
	}
	
	/*public WebElement getWifiSettingsLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']"));
		return elem;
	}*/
	
	public WebElement getWifiSettingsLocator(){
		elem = driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]"));
		return elem;
	}
	
	public WebElement getTextBoxLocator() {
		elem = driver.findElement(By.className("android.widget.EditText"));
		return elem;
	}
	
	public List<WebElement> getButtonLocator() {
		List elements = driver.findElements(By.className("android.widget.Button"));
		return elements;
	}
	
	
	public void waitForElement()
	{
		wait.until(ExpectedConditions.elementToBeClickable(getWifiCheckboxLocator()));
	}
	
	
	
}
