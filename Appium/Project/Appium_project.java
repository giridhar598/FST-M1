package appium;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Appium_project {
	AndroidDriver<MobileElement> driver=null;
	WebDriverWait wait=null;
	List<String> eleTask=new ArrayList<String>();
	
	@BeforeClass()
	public void setUp() throws MalformedURLException {DesiredCapabilities caps = new DesiredCapabilities();
	
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
	public void googleTaskActivity() {
		addTask("Complete Activity with Google Tasks");
		addTask("Complete Activity with Google Keep");
		addTask("Complete the second Activity Google Keep");
		List<MobileElement> ele=driver.findElementsById("task_name");		
		for(MobileElement ele1 : ele) {
			eleTask.add(ele1.getText());
		}
		Assert.assertTrue(eleTask.contains("Complete Activity with Google Tasks"));
		Assert.assertTrue(eleTask.contains("Complete Activity with Google Keep"));
		Assert.assertTrue(eleTask.contains("Complete the second Activity Google Keep"));
	}
	public void addTask(String taskName) {
		//click on Plus icon to add task
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("tasks_fab")));
		driver.findElementById("tasks_fab").click();
		//enter task name
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title")));
		driver.findElementById("add_task_title").sendKeys(taskName);
				
		//click on Save button
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_done")));
		driver.findElementById("add_task_done").click();
	}
	
	@AfterClass()
    public void closeDriver() {
    	driver.quit();
    }
	
}