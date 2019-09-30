import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmultiple {
	WebDriver driver;
	@Given("user is in testmeapp login page")
	public void user_is_in_testmeapp_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07216trng_M7A.05.20\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}

	@When("the user provides {string} and {string}")
	public void the_user_provides_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	    driver.findElement(By.name("Login")).click();
	}

	@Then("the home page must be displayed to the user")
	public void the_home_page_must_be_displayed_to_the_user() {
	    // Write code here that turns the phrase above into concrete actions
		String name=driver.findElement(By.xpath("//ul[contains(text(), 'Hi')]")).getText();
		System.out.println("Name is:"+name);
		//Assert.assertEquals(name, "Hi, Lalitha");
		driver.close();
	}


}
