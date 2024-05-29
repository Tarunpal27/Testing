import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class contactus {
    WebDriver driver;
    @Given("I am on Home page")
    public void iAmOnHomePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }

    @When("I click on Contact Us button")
    public void iClickOnContactUsButton() {
        WebElement contactUsBtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/ul[2]/li[1]/div/div/a"));
        contactUsBtn.click();
    }

    @Then("I should be able to see Contact Us form")
    public void iShouldBeAbleToSeeContactUsForm() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("contact-us"), "The Contact Us form not displayed");
    }
}
