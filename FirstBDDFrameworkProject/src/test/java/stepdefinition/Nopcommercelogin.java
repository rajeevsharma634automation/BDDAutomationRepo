package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Nopcommercelogin {

	WebDriver driver = null;

	@Given("User is on Nopcommerce login page")
	public void user_is_on_nopcommerce_login_page() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("Login Complete");
	}

	@And("^Nopcommerce User enters (.*) and (.*)$")
	public void nopcommerce_user_enters_username_and_password(String username, String password) {

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
		System.out.println("User enter Login Complete");
	}

	@When("Clicks on Nopcommerce login page")
	public void clicks_on_nopcommerce_login_page() {
		driver.findElement(By.xpath("//*[text()='Log in'] ")).click();
		System.out.println("User cliks on Login Complete");
	}

	@Then("Nopcommerce User is navigated to Home page")
	public void nopcommerce_user_is_navigated_to_home_page() {

		String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard / nopCommerce administration";
        if (actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title matched - Login Successfull");
        else
            System.out.println("Title didn't match - Login unsuccessfull");

		driver.close();
		driver.quit();

	}

}
