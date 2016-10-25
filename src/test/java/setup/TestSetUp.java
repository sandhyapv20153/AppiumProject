package setup;

import java.net.MalformedURLException;
import Utility.AppiumDriverBuilder;
import io.appium.java_client.android.AndroidDriver;


public class TestSetUp {
	
	public AndroidDriver driver;

	public AndroidDriver driverNativeAppTestSetup()
	{
		//AppiumDriverBuilder.AndroidBuilder  androidDriver = new  AppiumDriverBuilder.AndroidBuilder();
		AppiumDriverBuilder  androidDriver = new  AppiumDriverBuilder();
		try {
			driver=androidDriver.nativeAppDriverBuild();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	public AndroidDriver driverWebAppTestSetup()
	{
		//AppiumDriverBuilder.AndroidBuilder  androidDriver = new  AppiumDriverBuilder.AndroidBuilder();
		AppiumDriverBuilder  androidDriver = new  AppiumDriverBuilder();
		try {
			androidDriver.webAppDriverBuild();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

}
