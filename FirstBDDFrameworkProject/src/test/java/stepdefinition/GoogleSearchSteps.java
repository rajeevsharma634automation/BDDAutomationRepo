package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	

    WebDriver driver = null;

    @Given("Browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step:- Browser is open");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @And("User is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step:- User is on google search page");
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
    }

    @When("User enters the text in search box")
    public void user_enters_the_text_in_search_box() throws InterruptedException {
        System.out.println("Inside Step:- User enters the text in search box");
        driver.findElement(By.name("q")).sendKeys("nopcommerce");
    }

    @And("hits enter")
    public void hits_enter() throws InterruptedException {
        System.out.println("Inside Step:- hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @Then("User is navigated to search result")
    public void user_is_navigated_to_search_result() {
        System.out.println("Inside Step:- User is navigated to search result");
        driver.getPageSource().contains("Store Demo");
        driver.close();
        driver.quit();
    }

}
