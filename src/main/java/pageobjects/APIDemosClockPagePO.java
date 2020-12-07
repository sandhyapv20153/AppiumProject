package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosClockPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosClockPagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getOneLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='1']"));
		return elem;
	}
	
	public WebElement getTwoLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='2']"));
		return elem;
	}
	
	public WebElement getThreeLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='3']"));
		return elem;
	}
	
	public WebElement getFourLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='4']"));
		return elem;
	}
	
	public WebElement getFiveLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='5']"));
		return elem;
	}
	
	public WebElement getSixLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='6']"));
		return elem;
	}
	
	public WebElement getSevenLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='7']"));
		return elem;
	}
	
	public WebElement getEightLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='8']"));
		return elem;
	}
	
	public WebElement getNineLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='9']"));
		return elem;
	}
	
	public WebElement getTenLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='10']"));
		return elem;
	}
	
	public WebElement getElevenLocator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='11']"));
		return elem;
	}
	
	public WebElement getMinute15Locator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='15']"));
		return elem;
	}
	
	public WebElement getMinute45Locator(){
		elem = driver.findElement(By.xpath("//*[@content-desc='45']"));
		return elem;
	}
	
	
}


