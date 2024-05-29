import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdown {
    WebDriver driver;
    @Given("I am on Home page of Xenonstack")
    public void iAmOnHomePageOfXenonstack() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }

    @When("I hover on any Navbar Service")
    public void iHoverOnAnyNavbarService() {
        WebElement serviceDropdown = driver.findElement(By.xpath("//*[@id=\"nav-service\"]"));
        serviceDropdown.click();
    }

    @And("Click on Go to page")
    public void clickOnGoToPage() {
        WebElement goToBtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/ul[1]/li[2]/div/div[1]/div/div/div[1]/div[1]/div/a"));
        goToBtn.click();
    }

    @Then("I should reach the corresponding Service page")
    public void iShouldReachTheCorrespondingServicePage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("platform-engineering"), "The search results were not displayed");
    }
}
