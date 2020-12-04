package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosNamesPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosNamesPagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getPeopleNameLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		return elem;
	}
	
	public WebElement getDogNameLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Dog Names']"));
		return elem;
	}
	
	public WebElement getCatNameLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Cat Names']"));
		return elem;
	}
	
	public WebElement getFishNameLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Cat Names']"));
		return elem;
	}
	
	public WebElement getSampleMenuLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']"));
		return elem;
	}
	
	public WebElement getSampleActionLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample action']"));
		return elem;
	}
		
		
}


