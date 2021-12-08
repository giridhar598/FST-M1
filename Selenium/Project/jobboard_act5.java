import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act5 {
	WebDriver driver;
	 @BeforeMethod
	 public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/");
	
	 }
	 
@Test
  public void test4() {
 driver.findElement(By.id("menu-item-24")).click();
 String title = driver.getTitle();
 System.out.println("Page title is: " + title);
 Assert.assertEquals("Jobs – Alchemy Jobs", title);
	
	}
@AfterMethod

public void afterMethod() throws InterruptedException {
	 Thread.sleep(5);
	 driver.quit();
    
}
}
