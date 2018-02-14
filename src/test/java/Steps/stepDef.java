package Steps;

import AsdaProject.AsdaGroceryHeaderPage;
import AsdaProject.AsdaHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

public class stepDef {

    AsdaHomePage asdaHomePage = new AsdaHomePage();
    WebDriver driver;
    AsdaGroceryHeaderPage asdaGroceryHeaderPage = new AsdaGroceryHeaderPage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        assertThat(asdaHomePage.isOnHomePage(), is(true));
    }

    @When("^I select \"([^\"]*)\"$")
    public void i_select(String to, String category, String depaCategory, String subCategory, String product) {
        asdaHomePage.selectCategory(to);
        asdaGroceryHeaderPage.hoverToCategoryItems(category);
        asdaGroceryHeaderPage.hoverToDepCategoryItems(depaCategory);
        asdaGroceryHeaderPage.cliockToDepSubCategoryItems(subCategory);
        asdaGroceryHeaderPage.clickOnCategoryItems(product);
        asdaGroceryHeaderPage.randomProductSelection();
    }

    @Then("^I should see all different type of Apples$")
    public void i_should_see_all_different_type_of_Apples() {
        String actual = driver.findElement(By.cssSelector(".prod-title")).getText();
        String expected = ("Apples");
        assertThat(actual, Matchers.is(containsString(expected)));
    }
}
