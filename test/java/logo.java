import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class logo {
    WebDriver driver;
    @Given("On any page")
    public void onAnyPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/platform-engineering");
    }

    @When("I click on logo")
    public void iClickOnLogo() {
        WebElement logoBtn = driver.findElement(By.cssSelector("li.nav-li:nth-child(1) > a:nth-child(1) > img:nth-child(1)"));
        logoBtn.click();
    }

    @Then("I should visit the homepage")
    public void iShouldVisitTheHomepage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/"), "The search results were displayed");
    }
}
