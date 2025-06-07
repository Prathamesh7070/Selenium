package testDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.an.E;
import io.cucumber.java.en.And;

public class Defination {
    ChromeDriver driver;
    @Given("user is on login page")
    public void user_is_on_login_page() {
     driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    @When("^user enters correct username (.+) and (.+)$")
    public void user_enters_correct_username_and_password(String username, String password) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(username);
        Thread.sleep(2000);
        
        driver.findElement(By.id("pass")).sendKeys(password);
        Thread.sleep(2000);
    }

   

    @Then("user is able to login successfully")
    public void user_is_able_to_login_successfully() 
    {
       driver.quit();
    }
    
}