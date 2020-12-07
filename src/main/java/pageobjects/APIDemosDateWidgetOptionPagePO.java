package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosDateWidgetOptionPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosDateWidgetOptionPagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getDialogLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='1. Dialog']"));
		return elem;
	}
	
	public WebElement getInlineLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']"));
		return elem;
	}
	
	
}


