package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class projectact1 {
	
AppiumDriver<MobileElement> driver = null;
	
    WebDriverWait wait;
    @BeforeClass
	
    public void beforeClass() throws MalformedURLException {
	
        // Set the Desired Capabilities
	
        DesiredCapabilities caps = new DesiredCapabilities();
	
        caps.setCapability("deviceName", "emulator");
	
        caps.setCapability("platformName", "Android");
	
        caps.setCapability("appPackage", "com.android.contacts");
	
        caps.setCapability("appActivity", ".activities.PeopleActivity");
	
        caps.setCapability("noReset", true);
        
        // Instantiate Appium Driver
    	
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	
        driver = new AndroidDriver<MobileElement>(appServer, caps);
	
        wait = new WebDriverWait(driver, 5);
	
    }
	
	
	
  @Test
  public void f() {
  }
}
