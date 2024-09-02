package StepsDF;

import java.io.File;
import java.io.IOException;
import java.util.Set;

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

public class SoftToys {
	
	WebDriver driver;
	
	public static void capture(WebDriver driver, int n) throws IOException {
		// Step 1 : Calling takescreenshot interface and casting it to driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		// Step 2 : Using getscreenshotAs() to take screenshot
		File image = ts.getScreenshotAs(OutputType.FILE);
		// Step 3 : We have to create a new File in our local machine using File class
		// by creating object.
		File img = new File("C:\\Users\\salun\\OneDrive\\Pictures\\Naaptol_BDD Screenshot\\ST" + n + ".png");
		FileUtils.copyFile(image,img);

	}
	
	@Given("open the browser, enter the Naaptol url")
	public void open_the_browser_enter_the_naaptol_url() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.manage().window().maximize();
		
	    
	}

	@Given("Click KidsAndToys option from shopping categories")
	public void click_kids_and_toys_option_from_shopping_categories() {
		
		driver.findElement(By.cssSelector("[class='cate_head']")).click();
		
		driver.findElement(By.linkText("Kids & Toys")).click();
	    
	}

	@When("click the soft toys link,select with cash on delivery")
	public void click_the_soft_toys_link_select_with_cash_on_delivery() {
		
		driver.findElement(By.linkText("Soft Toys")).click();
		
		driver.findElement(By.id("iscod")).click();
	    
	}

	@When("selcect goldebHUb brand, select price,select plush toys type")
	public void selcect_goldeb_h_ub_brand_select_price_select_plush_toys_type() throws InterruptedException {
		
		driver.findElement(By.id("brandFilterBox39067")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[name='999 - 999']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("featureFilterBox0f1")).click();
	    
	}

	@Then("click the prodect user should be on same page of product")
	public void click_the_prodect_user_should_be_on_same_page_of_product() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("2 Ft Large Teddy Bear for Kids")).click();
		
		//String parentwindowString = driver.getWindowHandle();
		
		Set<String> allwindowSet = driver.getWindowHandles();
		
		for(String idString : allwindowSet) {
			driver.switchTo().window(idString);
		}
		
		Assert.assertEquals(driver.getTitle(), "Buy 2 Ft Large Teddy Bear for Kids Online at Best Price in India on Naaptol.com"); 
	}

	@Then("ckeck product available or not")
	public void ckeck_product_available_or_not() throws IOException {
		
		String availabilityMessage = driver.findElement(By.cssSelector("[id=\"productPriceDisplay\"]")).getText();
		
		if(availabilityMessage.contains("Currently Not Available")) {
			System.out.println("Not Available");
		}else {
			System.out.println("Product is available");
		}
		
		capture(driver, 1);
	    
		driver.quit();
	}
	

}
