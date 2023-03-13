package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AdminLogin 
{
     public static WebDriver driver;	
	
     @Given("Launch Erp Application with url {string}")
     public void launch_erp_application_with_url(String url)
	{
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe") ;
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(url);
		
	}
	@When("enter valid username, password and click login")
	public void enter_valid_username_password_and_click_login() 
	{
		driver.findElement(By.xpath("//input[@type = 'text' and @id = 'txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password' and @id = 'txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@class = 'button' and @value= 'LOGIN']")).click();
	}
	@Then("Validate the result")
	public void validate_the_result() 
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed()){
			System.out.println("Admin Login Successful");
		}else
		{
			System.out.println("Admin Login Failed");
		}
	}
}
