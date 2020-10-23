package Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AndroidDriverWebAppInitialization {
	
	protected File appPath;
	protected DesiredCapabilities cap;
	protected AndroidDriver driver=null;
	
	public AndroidDriverWebAppInitialization()
	{
		try
		{
			cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator"); // setting the emulator
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);//Set time for the page to load on the emulator device.
			
			//Which driver should be invoked ? Android driver  - in port 4723
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		}
		catch(MalformedURLException m)
		{
			System.out.println(m.getMessage());
		}
		System.out.println("Android driver for WebApp initialized....");
		
	}
	
	public AndroidDriver getDriverValue()
	{
		return driver;
	}
	
	public void closeApp()
	{
		driver.quit();
	}

}
