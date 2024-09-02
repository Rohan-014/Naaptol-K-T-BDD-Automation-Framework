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

public class UT {
	
	WebDriver driver;
	
	public static void capture(WebDriver driver, int n) throws IOException {
		// Step 1 : Calling takescreenshot interface and casting it to driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		// Step 2 : Using getscreenshotAs() to take screenshot
		File image = ts.getScreenshotAs(OutputType.FILE);
		// Step 3 : We have to create a new File in our local machine using File class
		// by creating object.
		File img = new File("C:\\Users\\salun\\OneDrive\\Pictures\\Naaptol_BDD Screenshot\\UT" + n + ".png");
		FileUtils.copyFile(image,img);

	}
	
	@Given("Open the Browser, enter Naaptol url")
	public void open_the_browser_enter_naaptol_url() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().window().maximize();

	}

	@Given("Click the KidsAndToys Option from dropdown, click the unique toys link")
	public void click_the_kids_and_toys_option_from_dropdown_click_the_unique_toys_link() {
	   
		driver.findElement(By.cssSelector("[class='cate_head']")).click();
		
		driver.findElement(By.linkText("Kids & Toys")).click();
		
		driver.findElement(By.linkText("Unique Toys")).click();
	}

	@When("select cash on delivery, select branded, select price , select discount")
	public void select_cash_on_delivery_select_branded_select_price_select_discount() throws InterruptedException {
		
		driver.findElement(By.cssSelector("[name='iscod']")).click();
		
		driver.findElement(By.cssSelector("[name=\"Branded\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("discountFilterBox1")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("priceFilterBox1")).click();
		
		Thread.sleep(5000);
	    
	}

	@When("click the product , click the buy, proceed to checkout")
	public void click_the_product_click_the_buy_proceed_to_checkout() throws InterruptedException, IOException {
		
		driver.findElement(By.linkText("Walkie Talkie with Inbuilt Watch")).click();
		
		capture(driver, 1);
		
		for(String windowHandleString :driver.getWindowHandles()) {
		driver.switchTo().window(windowHandleString);
		}
		
		driver.findElement(By.cssSelector("[class='red_button icon chat']")).click();
		
		Thread.sleep(5000);
		
		capture(driver, 2);
		
		driver.findElement(By.xpath("//ul[@id='shopCartHead']/li[2]/a[2]")).click();
		
	    
	}

	@Then("user should be on login page")
	public void user_should_be_on_login_page() throws IOException {
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.naaptol.com/checkout/guestuserlogin.html");
		
		capture(driver, 3);
		
		driver.quit();
	    
	}




}
