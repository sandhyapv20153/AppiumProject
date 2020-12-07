package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class APIDemosDragDropPagePO {
	
	private WebElement elem;
	private AndroidDriver driver;
	
	public APIDemosDragDropPagePO(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public List<WebElement> getCircleLocators(){
		List<WebElement> listValues = driver.findElements(By.className("android.view.View"));
		return listValues;
	}
	

}


