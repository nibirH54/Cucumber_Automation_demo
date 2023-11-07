package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver = new ChromeDriver();

    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
        Thread.sleep(3000);
        System.out.println("Inside Step - user is on login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        driver.findElement(By.id("user_email_login")).sendKeys("nibir@scratchtechsolutions.onmicrosoft.com");
        Thread.sleep(3000);
        driver.findElement(By.id("user_password")).sendKeys("Pacificocean2023@");
        Thread.sleep(5000);
        System.out.println("Inside Step- user enters username and password ");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() throws InterruptedException {
        driver.findElement(By.id("user_submit")).click();
        Thread.sleep(5000);
        System.out.println("Inside step- user clicks on the login button");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
       String homePageUrl = driver.getCurrentUrl();
       System.out.println("The home page url is: " + homePageUrl);
       String homePageTitle = driver.getTitle();
       System.out.println("The homepage Title is:" + homePageTitle);
       System.out.println("Inside step - user is navigated to the home page");
       driver.close();

    }

}
