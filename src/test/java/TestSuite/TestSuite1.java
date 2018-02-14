package TestSuite;

import AsdaProject.AsdaGroceryHeaderPage;
import AsdaProject.AsdaHomePage;
import org.junit.Test;

public class TestSuite1  {
    AsdaHomePage asdaHomePage = new AsdaHomePage();
    AsdaGroceryHeaderPage asdaGroceryHeaderPage=new AsdaGroceryHeaderPage();

    @Test
    public void regression() {
        asdaHomePage.selectCategory("Groceries");
        asdaGroceryHeaderPage.hoverToCategoryItems("Fresh Food");
        asdaGroceryHeaderPage.hoverToDepCategoryItems("Fruit");
        asdaGroceryHeaderPage.cliockToDepSubCategoryItems("Apples, Pears & Rhubarb");
        asdaGroceryHeaderPage.clickOnCategoryItems("Apples");
        asdaGroceryHeaderPage.randomProductSelection();
    }
}
