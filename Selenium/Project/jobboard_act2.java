import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act2 {

	     WebDriver driver;
		 @BeforeMethod
		 public void beforeMethod() {
			  driver = new FirefoxDriver();
			  driver.get("https://alchemy.hguy.co/jobs/");
		 }

		 @Test
		  public void test1() throws InterruptedException {
			  
			 String heading=driver.findElement(By.className("entry-title")).getText();
			 
			 System.out.println(heading);
			 
			 Thread.sleep(5);
			  
			  Assert.assertEquals("Welcome to Alchemy Jobs", heading);
			  
		  
		}
		 @AfterMethod

		 public void afterMethod() throws InterruptedException {
			 Thread.sleep(5);
		 	 driver.quit();
		     
		 }
		 
	}


