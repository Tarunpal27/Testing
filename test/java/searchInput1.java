import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class searchInput1 {
    WebDriver driver;
    @Given("Search box is open")
    public void searchBoxIsOpen() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");

        WebElement searchBtn = driver.findElement(By.cssSelector("#imageidsearch1"));
        searchBtn.click();
    }

    @When("I Enter Nothing and press Enter")
    public void iEnterNothingAndPressEnter() {
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input"));
        searchInput.sendKeys("");
        searchInput.sendKeys(Keys.ENTER);
    }

    @Then("I should get an alert to write something")
    public void iShouldGetAnAlertToWriteSomething() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertFalse(currentUrl.contains("hs-search-results"), "The search results were displayed");

    }
}
