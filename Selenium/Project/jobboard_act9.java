import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act9 {
	WebDriver driver;
	 @BeforeMethod
	 public void beforeMethod() throws InterruptedException {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
		  Thread.sleep(5000);
}
	
  @Test
  public void test8() throws InterruptedException {
	  driver.findElement((By.id("user_login"))).sendKeys("root");
	  driver.findElement((By.id("user_pass"))).sendKeys("pa$$w0rd");
	  driver.findElement((By.id("wp-submit"))).click();
	  Thread.sleep(3);
	  
	  driver.findElement(By.partialLinkText("Job Listings")).click();
	  driver.findElement(By.className("page-title-action")).click();
	  driver.findElement((By.id("post-title-0"))).sendKeys("Test Automation");	
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,70)"); 
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
      Thread.sleep(4000);
      
     // driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
      driver.findElement(By.xpath("//div[@class='editor-post-publish-panel__header-publish-button']/button")).click();
      Thread.sleep(4000);
      
     // driver.findElement(By.xpath("//div[@class='edit-post-header__settings']//a")).click();
     // Thread.sleep(4000);
      driver.findElement((By.xpath("//div[contains(@class,'post-publish-panel__postpublish-header is-opened')]/a"))).click();
      Thread.sleep(7000);
   driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li[1]")).click();
      
      Thread.sleep(4000);
      
 String job1=  driver.findElement(By.xpath("//div[@class='location']/..//h3")).getText();
   System.out.println(job1);
   Assert.assertEquals("Test Automation", job1);
     
  }
  @AfterMethod

  public void afterMethod() throws InterruptedException {
  	 Thread.sleep(5);
  	 driver.quit();
}
}
