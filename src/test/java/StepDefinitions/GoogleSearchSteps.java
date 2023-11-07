package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {

    WebDriver driver = new ChromeDriver();

    @Given("browser is open")
    public void browser_is_open() {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("Inside step - Browser opened");
    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        String googlePageUrl = driver.getCurrentUrl();
        System.out.println(googlePageUrl);
        System.out.println("Inside step - User is on Google search page");
    }
    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() throws InterruptedException {
       WebElement searchBox = driver.findElement(By.id("APjFqb"));
       searchBox.sendKeys("Automation");
        Thread.sleep(3000);
       searchBox.sendKeys(Keys.ENTER);
       System.out.println("Inside step - user enters a text in search box");
    }
    @And("hits enter")
    public void hits_enter() {
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys(Keys.ENTER);
        System.out.println("Inside step - User hits the enter button");
    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        String searchPageUrl = driver.getCurrentUrl();
        System.out.println(searchPageUrl);
        System.out.println("User is navigated to search results");
        driver.close();
    }

}
