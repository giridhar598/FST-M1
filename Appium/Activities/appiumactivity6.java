package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class appiumactivity6 {
	
	 AppiumDriver<MobileElement> driver = null;
		
	 
		
	    @BeforeClass
		
	    public void beforeClass() throws MalformedURLException {
		
	        // Set the Desired Capabilities
		
	        DesiredCapabilities caps = new DesiredCapabilities();
		
	        caps.setCapability("deviceName", "emulator");
		
	        caps.setCapability("platformName", "Android");
		
	        caps.setCapability("appPackage", "com.android.calculator2");
		
	        caps.setCapability("appActivity", ".Calculator");
		
	        caps.setCapability("noReset", true);
		
	 
		
	        // Instantiate Appium Driver
		
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	      //  wait = new WebDriverWait(driver, 5);
	    	
	        
	    	
	        driver.get("https://www.training-support.net/selenium/lazy-loading");
		
	    }
		
	 
		
	    @Test
		
	    public void imageScrollTest() {
		
	        // wait for page to load
		
	        MobileElement pageTitle = driver.findElementByClassName("android.widget.TextView");
		
	        //wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));
		
	 
		
	        // Count the number of images shown on the screen
		
	        List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
		
	        System.out.println("Number of image shown currently: " + numberOfImages.size());
		
	        
		
	        // Assertion before scrolling
		
	        Assert.assertEquals(numberOfImages.size(), 4);
		
	        
		
	        // Scroll to Helen's post
		
	        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));
		
	        
		
	        // Find the number of images shown after scrolling
		
	        numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
		
	        System.out.println("Number of image shown currently: " + numberOfImages.size());
		
	        
		
	        // Assertion after scrolling
		
	        Assert.assertEquals(numberOfImages.size(), 4);
		
	    }
		
	 
		
	    @AfterClass
		
	    public void afterClass() {
		
	        driver.quit();
		
	    }
		
	    }
		


