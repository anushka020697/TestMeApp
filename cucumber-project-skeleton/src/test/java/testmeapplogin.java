import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class testmeapplogin {
	WebDriver driver;
	@Given("user is in testmeapp page")
	public void user_is_in_testmeapp_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07216trng_M7A.05.20\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}

	@When("the user provides login and password")
	public void the_user_provides_login_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.name("Login")).click();
	}

	@Then("the home page should be displayed")
	public void the_home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		String name=driver.findElement(By.xpath("//ul[contains(text(), 'Hi')]")).getText();
		System.out.println("Name is:"+name);
		Assert.assertEquals(name, "Hi, Lalitha");
	   
	}


}
