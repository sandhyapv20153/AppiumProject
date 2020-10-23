package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosButtonsPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosButtonsPagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getNormalButtonLocator(){
		elem = driver.findElement(By.id("com.example.android.apis:id/button_normal"));
		return elem;
	}
	
	public WebElement getSmallButtonLocator(){
		elem = driver.findElement(By.id("com.example.android.apis:id/button_small"));
		return elem;
	}
	
	public WebElement getOffButtonLocator(){
		elem = driver.findElement(By.className("android.widget.ToggleButton"));
		return elem;
	}
	
		
	
}


