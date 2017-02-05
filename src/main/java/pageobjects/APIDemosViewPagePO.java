package pageobjects;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.AppiumDriverBuilder;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosViewPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	private List list;
	
	public APIDemosViewPagePO(AndroidDriver driver) throws MalformedURLException
	{
		this.driver = driver;
	}
	
	public List getViewPageLocators(){
		list = driver.findElements(By.className("android.widget.TextView"));
		return list;
	}
	
		
}


