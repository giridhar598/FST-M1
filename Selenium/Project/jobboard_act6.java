import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act6 {
	WebDriver driver;
	 @BeforeMethod
	 public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/");
	
	 }
	 
	
	
  @Test
  public void test5() throws InterruptedException {
		 driver.findElement(By.id("menu-item-24")).click();
		 driver.findElement((By.id("search_keywords"))).sendKeys("Test analyst");
		 driver.findElement(By.className("search_submit")).click();
		 Thread.sleep(5000);
		 
		 WebElement joblist = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a"));
         joblist.click();
		// driver.findElement(By.xpath("//*[contains(@href,'https://alchemy.hguy.co/jobs/job/test-analyst-13/')]")).click();
		
         driver.findElement(By.xpath("//input[@class='application_button button']")).click();
         
         String mail=driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
         System.out.println("email details to: " +  mail);
         
}

  @AfterMethod

  public void afterMethod() throws InterruptedException {
  	 Thread.sleep(5);
  	 driver.quit();
      
  }
}
