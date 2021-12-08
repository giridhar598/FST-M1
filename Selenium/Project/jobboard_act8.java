import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act8 {
	
	WebDriver driver;
	 @BeforeMethod
	 public void beforeMethod() throws InterruptedException {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
		  Thread.sleep(5000);
		 // driver.navigate().to("https://alchemy.hguy.co/jobs/wp-login.php?redirect_to=https%3A%2F%2Falchemy.hguy.co%2Fjobs%2Fwp-admin%2F&reauth=1");
		  

	
	 }
  @Test
  public void test7() {
	  driver.findElement((By.id("user_login"))).sendKeys("root");
	  driver.findElement((By.id("user_pass"))).sendKeys("pa$$w0rd");
	  driver.findElement((By.id("wp-submit"))).click();
	  
	  String title1 = driver.getTitle();
	  System.out.println("Page title is: " + title1);
	  
	  Assert.assertEquals("Dashboard ‹ Alchemy Jobs — WordPress", title1);
	  
	  
	  
  }
  @AfterMethod

  public void afterMethod() throws InterruptedException {
  	 Thread.sleep(5);
  	 driver.quit();
}
}