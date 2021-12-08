import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act4 {
	
	WebDriver driver;
	 @BeforeMethod
	 public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/");
	
	 }
	 
 @Test
  public void test3() {
	 String heading1=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2")).getText();
	 System.out.println(heading1);
	 Assert.assertEquals("Quia quis non", heading1);
	 
	  }
 @AfterMethod

 public void afterMethod() throws InterruptedException {
	 Thread.sleep(5);
 	 driver.quit();
 }
}
     