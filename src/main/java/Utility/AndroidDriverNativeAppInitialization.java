package Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidDriverNativeAppInitialization {
	
	protected File appPath;
	protected DesiredCapabilities cap;
	protected AndroidDriver driver=null;
	
	public AndroidDriverNativeAppInitialization()
	{
		try
		{
			String apkName = PropertyFileUtility.readPropertyFile(Constants.PROJECT_PROPERTYFILE_PATH,"ANDROID_APK_NAME");
			String deviceName = PropertyFileUtility.readPropertyFile(Constants.PROJECT_PROPERTYFILE_PATH,"DEVICE_NAME");
		   	appPath = new File(Constants.ANDROID_APK_PATH, apkName);
			cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName); // setting the emulator
			cap.setCapability(MobileCapabilityType.APP, appPath.getAbsolutePath());
			
			//Which driver should be invoked ? Android driver  - in port 4723
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
		}
		catch(MalformedURLException m)
		{
			System.out.println(m.getMessage());
		}
		System.out.println("Android driver initialized....");
		
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
