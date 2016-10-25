package Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumDriverBuilder {
	
	protected File appPath;
	protected DesiredCapabilities cap;
	public AndroidDriver driver;
	
		public AndroidDriver nativeAppDriverBuild() throws MalformedURLException
		{
			
			String basePath = new File("").getAbsolutePath();
		    System.out.println(basePath);
		    String relativePath = basePath.concat("\\src\\main\\resources");
		   		    
			appPath = new File(relativePath, "bookMyShow-ucb.apk");
			cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator"); // setting the emulator
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);//Set time for the page to load on the emulator device.
			cap.setCapability(MobileCapabilityType.APP, appPath.getAbsolutePath());
			
			//Which driver should be invoked ? Android driver  - in port 4723
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;
		}
		
		public AndroidDriver webAppDriverBuild() throws MalformedURLException
		{
			cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator"); // setting the emulator
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);//Set time for the page to load on the emulator device.
			
			//Which driver should be invoked ? Android driver  - in port 4723
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;
		}
		

}
