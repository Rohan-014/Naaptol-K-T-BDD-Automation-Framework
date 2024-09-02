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

public class LA {
	
	WebDriver driver;
	
	public static void capture(WebDriver driver, int n) throws IOException {
		// Step 1 : Calling takescreenshot interface and casting it to driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		// Step 2 : Using getscreenshotAs() to take screenshot
		File image = ts.getScreenshotAs(OutputType.FILE);
		// Step 3 : We have to create a new File in our local machine using File class
		// by creating object.
		File img = new File("C:\\Users\\salun\\OneDrive\\Pictures\\Naaptol_BDD Screenshot\\LA" + n + ".png");
		FileUtils.copyFile(image,img);

	}
	
	@Given("open the browser, enter Naaptol url")
	public void open_the_browser_enter_naaptol_url() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().window().maximize();
	    
	}

	@When("click the kids and toys option from dropdown then click the Learning & Activity link")
	public void click_the_kids_and_toys_option_from_dropdown_then_click_the_learning_activity_link() {
		
		driver.findElement(By.cssSelector("[class='cate_head']")).click();
		
		driver.findElement(By.linkText("Kids & Toys")).click();
		
		driver.findElement(By.linkText("Learning & Activity")).click();
	    
	    
	}

	@Then("user should be relevent page")
	public void user_should_be_relevent_page() throws IOException {
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.naaptol.com/shop-online/toys-nursery/learning-activity.html");
		
		capture(driver, 1);
	    
		driver.close();
	}

}
