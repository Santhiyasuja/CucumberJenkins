package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^My amazon app is open$")
	public void my_amazon_app_is_open() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "src\\test\\java\\com\\rc\\Cucumber\\chromedriver.exe");					
    driver= new ChromeDriver();

    driver.manage().window().maximize();			
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);				

    }

	@When("^I click Signin$")
	public void i_click_Signin() throws Throwable {
	
	driver.findElement(By.id("nav-link-yourAccount")).click();
}

	@Then("^I enter userid$")
	public void i_enter_userid() throws Throwable {
	driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("shariya777@gmail.com");
	
}
	@Then("^I click Continue$")
	public void i_click_Continue() throws Throwable {
	driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
	
}
	@Then("^I enter password$")
	public void i_enter_password() throws Throwable {
	driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("9941426105");
}

	@Then("^I Click Signin$")
	public void i_Click_Signin() throws Throwable {
	
	driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
}
	
	}


