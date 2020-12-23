package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosSwitchesPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosSwitchesPagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getStandardSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@index='0']"));
		return elem;
	}
	
	public WebElement getDefaultSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@index='1']"));
		return elem;
	}
	
	public WebElement getMonitoredSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@resource-id='io.appium.android.apis:id/monitored_switch']"));
		return elem;
	}
	
	
	public WebElement getCustomizedTextSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@index='3']"));
		return elem;
	}
	
	
	public WebElement getToplevelSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@index='4']"));
		return elem;
	}
	
	
	public WebElement getMiddlelevelSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@index='5']"));
		return elem;
	}
	
	public WebElement getBottomlevelSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@index='6']"));
		return elem;
	}
	
	public WebElement getMatchParentSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@index='7']"));
		return elem;
	}
	
	
	public WebElement getStandaloneSwitchLocator(){
		elem = driver.findElement(By.xpath("//*[@index='9']"));
		return elem;
	}
		
}


