package AsdaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AsdaHomePage extends BasePage{

    public void selectCategory(String to){
        List<WebElement> categories = driver.findElements(By.className("navigation-primary__link"));
        for (WebElement element : categories) {
            if (element.getText().equalsIgnoreCase(to)) {
                new Actions(driver).moveToElement(element).perform();
                element.click();
                break;
            }
        }
}
    public boolean isOnHomePage() {
        return driver.getCurrentUrl().endsWith(".com/");
    }
}
