import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class search {
    WebDriver driver;
    @Given("I am on the home page of the website")
    public void iAmOnTheHomePageOfTheWebsite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }

    @When("I click on the search button")
    public void iClickOnTheSearchButton() {
        WebElement searchBtn = driver.findElement(By.cssSelector("#imageidsearch1"));
        searchBtn.click();
    }

    @Then("a dropdown opens with a search input")
    public void aDropdownOpensWithASearchInput() {
        WebElement aboutDiv = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]"));
        String aboutDivDisplay = aboutDiv.getCssValue("display");
        Assert.assertEquals(aboutDivDisplay, "block", "The 'about-div' was not displayed");
    }
}
