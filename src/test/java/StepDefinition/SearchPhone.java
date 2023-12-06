package StepDefinition;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPhone extends BaseClass {
	public static HomePage home;
	public static String homePage;
	
	@Given("user open a amazon url")
	public void user_open_a_amazon_url() {
		BaseClass.initialization();
	    
	}

	@Given("user search iphone and select product")
	public void user_search_iphone_and_select_product() throws InterruptedException {
		 home=new HomePage();
		home.usersearchproduct("iphone");
		Thread.sleep(3000);
		WebElement wb1=driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Blue'])[2]"));
		String homePage=driver.getWindowHandle();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wb1);
		Thread.sleep(5000);
		wb1.click();
	}

	@When("user go to details page")
	public void user_go_to_details_page() {
		Set<String> ls = driver.getWindowHandles();
		ArrayList<String> allWin = new ArrayList<String>(ls);
		String productDetail = allWin.get(1);
		driver.switchTo().window(productDetail);
		
	    
	}

	@Then("user select and capture price and store in varible")
	public void user_select_and_capture_price_and_store_in_varible() {
		String price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
		System.out.println(price);
	    
	}

	@Then("add to cart")
	public void add_to_cart() throws InterruptedException {
		WebElement cart=driver.findElement(By.xpath(("(//input[@name='submit.add-to-cart'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cart);
		Thread.sleep(5000);
		cart.click();
	    
	}
	
	@When("user is on home page and click on Account and list")
	public void user_is_on_home_page_and_click_on_account_and_list() {
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
	    
	}

	@Then("user go to sign in page and click on create your amazon account link")
	public void user_go_to_sign_in_page_and_click_on_create_your_amazon_account_link() {
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	    
	}

	@Then("user enter firstname and lastname and mobile number and password")
	public void user_enter_firstname_and_lastname_and_mobile_number_and_password() {
		home.enterAllDetails("Poonam Jadhav","9370941373","poonam@123");
	    
	}

	@Then("click on verify mobile number link")
	public void click_on_verify_mobile_number_link() {
		home.verifyMobNo();
	    
	}


	@Given("user is on homePage")
	public void user_is_on_home_page() {
	    driver.switchTo().window(homePage);
	}

	@Given("user search phone")
	public void user_search_phone() {
		home.usersearchPhoneproduct("phone");
	}
	    
	@Given("click on sort by")
	public void click_on_sort_by() {
	WebElement sort=driver.findElement(By.xpath("//span[text()='Sort by:']"));  
	Actions act=new Actions(driver);
	act.click(sort).build().perform();
	act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).build().perform();
    

}
}