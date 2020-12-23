package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosViewPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	private List list;
	
	public APIDemosViewPagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public List getViewPageLocators(){
		list = driver.findElements(By.className("android.widget.TextView"));
		return list;
	}
	
	public WebElement getGalaryLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']"));
		return elem;
	}
	
	public WebElement getVisibilityLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Visibility']"));
		return elem;
	}
	
	public WebElement getDragDropLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']"));
		return elem;
	}
	
	public WebElement getSwitchesLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Switches']"));
		return elem;
	}
	
	public WebElement scrollToSwitchesLocator(){
		elem = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"));");
		return elem;
	}
	
	
	public void scrollToVisibilityLocator(){
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Visibility\"));");
	}
		
}


