import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobboard_act3 {
	WebDriver driver;
	 @BeforeMethod
	 public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/jobs/");
	 }
	 @Test
	  public void test2() {
		 WebElement img=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img"));
		 String src = img.getAttribute("src");
		 System.out.println("url is: " + src);
		 
}
	 @AfterMethod

	 public void afterMethod() throws InterruptedException {
		 Thread.sleep(5);
	 	 driver.quit();
	     
	 }
}