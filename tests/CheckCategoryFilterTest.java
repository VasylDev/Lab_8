package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ConfigurationReader;

public class CheckCategoryFilterTest extends BaseTest {
    private static final String categoryXPath = ConfigurationReader.get().getCategory();
    private static final String subcategoryXPath = ConfigurationReader.get().getSubcategory();

    @Test
    public void CheckCategoryFilter()
    {
        Assert.assertFalse(new HomePage(driver).selectCategory(categoryXPath, subcategoryXPath).IsCategoryEmpty());
    }
}
