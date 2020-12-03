package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class APIDemosPreferencePagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosPreferencePagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getFromXMLLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='1. Preferences from XML']"));
		return elem;
	}
	
	public WebElement getLaunchPreferenceOptionLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='2. Launching preferences']"));
		return elem;
	}
	
	public WebElement getPreferenceDependencyLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']"));
		return elem;
	}
	
	public WebElement getDefaultLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='4. Default values']"));
		return elem;
	}
	
	public WebElement getFromCodeLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='5. Preferences from code']"));
		return elem;
	}
	
	public WebElement getAdvancedPreferenceLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='6. Advanced preferences']"));
		return elem;
	}
	
	public WebElement getFragmentLocator(){
		elem = driver.findElement(By.xpath("\"//android.widget.TextView[@text='7. Fragment']"));
		return elem;
	}
	
	public WebElement getHeadersLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='8. Headers']"));
		return elem;
	}
	
	public WebElement getSwitchOptionLocator(){
		elem = driver.findElement(By.xpath("//android.widget.TextView[@text='9. Switch']"));
		return elem;
	}
	
}
