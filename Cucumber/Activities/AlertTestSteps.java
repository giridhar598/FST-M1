package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertTestSteps {
	
    WebDriver driver;
	
    WebDriverWait wait;
	
    Alert alert;
	
 
	
    @Given("^User is on the page$")
	
    public void openPage() {
	
        //Create Instances
	
        driver = new FirefoxDriver();
	
        wait = new WebDriverWait(driver, 10);
	
 
	
        //Open browser
	
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
	
    }
	
 
	
    @When("^User clicks the Simple Alert button$")
	
    public void openSimpleAlert() {
	
        driver.findElement(By.cssSelector("#simple")).click();
	
    }
	
 
	
    @When("^User clicks the Confirm Alert button$")
	
    public void openConfirmAlert() {
	
        driver.findElement(By.cssSelector("#confirm")).click();
	
    }
	
 
	
    @When("^User clicks the Prompt Alert button$")
	
    public void openPromptAlert() {
	
        driver.findElement(By.cssSelector("#prompt")).click();
	
    }
	
 
	
    @Then("^Alert opens$")
	
    public void switchFocus() {
	
        alert = driver.switchTo().alert();
	
    }

}
