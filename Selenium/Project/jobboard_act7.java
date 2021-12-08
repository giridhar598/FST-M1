import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act7 {
	
	WebDriver driver;
	 @BeforeMethod
	 public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/");
	
	 }
	
	
	
  @Test
  public void test6() throws InterruptedException {
	  
	  driver.findElement(By.id("menu-item-26")).click();
	  
	  driver.findElement(By.id("create_account_email")).sendKeys("giridhar598.s1@gmail.com");
	  driver.findElement(By.id("job_title")).sendKeys("Test Aanalyst");
	   driver.findElement(By.xpath("//*[@id=\"job_description_ifr\"]")).sendKeys("job application");
	  //driver.findElement(By.id("tinymce")).sendKeys("Giridhar");
	   
	  driver.findElement(By.id("application")).sendKeys("giridhar598.s@gmail.com");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,70)");            
      Thread.sleep(3000);
      System.out.println("Scrolled down");
      
  
      
      driver.findElement(By.id("company_name")).sendKeys("IBM Automation Testing");
	  
      Thread.sleep(10);
      
      driver.findElement(By.xpath(".//*[contains(@name,'submit_job')]")).click();
      
      driver.findElement(By.id("job_preview_submit_button")).click();
      
      String createdJob = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a/div/h3")).getText();
  	
  	System.out.println("created job is "+createdJob);
  	
  	Assert.assertEquals("Automation Test Engineer", createdJob);
      
  }
  @AfterMethod

  public void afterMethod() throws InterruptedException {
  	 Thread.sleep(5);
  	 driver.quit();
      
  }
}
