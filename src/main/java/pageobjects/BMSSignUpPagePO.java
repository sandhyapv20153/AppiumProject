package pageobjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class BMSSignUpPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public BMSSignUpPagePO(AndroidDriver driver) throws MalformedURLException
	{
		this.driver = driver;
	}
	
	public WebElement setFirstNameLocator(){
		elem = driver.findElement(By.id("com.bt.bms:id/edtFirstName"));
		return elem;
	}
	
}


