package StepsDF;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RCT {
	
	WebDriver driver;
	
	public static void capture(WebDriver driver, int n) throws IOException {
		// Step 1 : Calling takescreenshot interface and casting it to driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		// Step 2 : Using getscreenshotAs() to take screenshot
		File image = ts.getScreenshotAs(OutputType.FILE);
		// Step 3 : We have to create a new File in our local machine using File class
		// by creating object.
		File img = new File("C:\\Users\\salun\\OneDrive\\Pictures\\Naaptol_BDD Screenshot\\RCT" + n + ".png");
		FileUtils.copyFile(image,img);

	}
	
	@Given("open browser, enter the naaptol url")
	public void open_browser_enter_the_naaptol_url() {
	   
		driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().window().maximize();
	}

	@When("Click on the KidsAndToys from dropdown, click the RemoteControlToys")
	public void click_on_the_kids_and_toys_from_dropdown_click_the_remote_control_toys() {
		
		driver.findElement(By.cssSelector("[class='cate_head']")).click();
		
		driver.findElement(By.linkText("Kids & Toys")).click();
		
		driver.findElement(By.linkText("Remote Control Toys")).click();
	    
	}

	@Then("user should be on relevent option")
	public void user_should_be_on_relevent_option() throws IOException {
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.naaptol.com/shop-online/toys-nursery/remote-control-toys.html");
	   
		capture(driver, 1);
		
		driver.close();
	}



}
