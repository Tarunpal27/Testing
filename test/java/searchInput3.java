import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class searchInput3 {
    WebDriver driver;
    @Given("Search box open")
    public void searchBoxOpen() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");

        WebElement searchBtn = driver.findElement(By.cssSelector("#imageidsearch1"));
        searchBtn.click();
    }

    @When("I Enter space and press Enter")
    public void iEnterSpaceAndPressEnter() {
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input"));
        searchInput.sendKeys("null");
        searchInput.sendKeys(Keys.ENTER);
    }

    @Then("I should get no results or similar")
    public void iShouldGetNoResultsOrSimilar() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("hs-search-results"), "The search results were displayed");
    }
}
