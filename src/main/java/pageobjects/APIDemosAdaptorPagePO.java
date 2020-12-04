package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosAdaptorPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosAdaptorPagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getCustomAdaptorLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']"));
		return elem;
	}
	
	public WebElement getCursorLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='2. Cursor (People)']"));
		return elem;
	}
	
	public WebElement getSimpleAdaptorLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='3. Simple Adapter']"));
		return elem;
	}
		
}


