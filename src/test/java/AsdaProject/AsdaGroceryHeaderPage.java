package AsdaProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AsdaGroceryHeaderPage extends BasePage {
    public void hoverToCategoryItems(String category) {
        List<WebElement> primaryNavLists = driver.findElements(By.cssSelector("#primary-nav-items>div>div>li>a"));
        for (WebElement element : primaryNavLists) {
            if (element.getText().contains(category)) {
                new Actions(driver).moveToElement(element).click().build().perform();
                break;
            }
        }
    }

    public void hoverToDepCategoryItems(String category) {
        List<WebElement> primaryNavLists = driver.findElements(By.className("hasChild"));
        for (WebElement element : primaryNavLists) {
            if (element.getText().equalsIgnoreCase(category)) {
                element.click();
                break;
            }
        }
    }

    public void cliockToDepSubCategoryItems(String subaCategory) {
        List<WebElement> primaryNavList = driver.findElements(By.cssSelector("#aisle-holder>div>div>div>li"));
        for (WebElement element : primaryNavList) {
            if (element.getText().equalsIgnoreCase(subaCategory)) {
                element.click();
                break;
            }
        }
    }

    public void clickOnCategoryItems(String subCategory) {
        List<WebElement> primaryNavList = driver.findElements(By.cssSelector("#shelf-holder>div>div>div>li"));
        for (WebElement element : primaryNavList) {
            if (element.getText().equalsIgnoreCase(subCategory)) {
                element.click();
                break;
            }
        }
    }
    public void randomProductSelection() {
        List<WebElement> allProducts = driver.findElements(By.cssSelector(".line-clamp.line-clamp-3"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).sendKeys(Keys.ENTER);

        String actual = driver.findElement(By.cssSelector(".prod-title")).getText();
        String expected = ("Apples");

        assertThat(actual,is(containsString(expected)));
    }
}

