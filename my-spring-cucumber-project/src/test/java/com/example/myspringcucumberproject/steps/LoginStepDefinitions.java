package com.example.myspringcucumberproject.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefinitions {

    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("User is on the Facebook login page")
    public void user_is_on_the_facebook_login_page() {
        driver.get("https://www.facebook.com/");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("email")).sendKeys("your_username");
        driver.findElement(By.id("pass")).sendKeys("your_password");
    }

    @And("Clicks on the login button")
    public void clicks_on_the_login_button() {
        driver.findElement(By.name("login")).click();
    }

    @Then("User is successfully logged in")
    public void user_is_successfully_logged_in() {
        // This is a simple assertion. In a real scenario, you would check for a specific element on the page.
        assertEquals("Facebook", driver.getTitle());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
