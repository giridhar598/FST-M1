import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act1 {
	
	 WebDriver driver;
	 @BeforeMethod
	 public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/");
	 }
  @Test
  public void test() {
	  
	  String title = driver.getTitle();
	  System.out.println("Page title is: " + title);
	  
	  Assert.assertEquals("Alchemy Jobs – Job Board Application", title);
	  
  
}
@AfterMethod

public void afterMethod() {
	 driver.quit();
    
}
}