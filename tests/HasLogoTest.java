package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class HasLogoTest extends BaseTest{
    @Test
    public void HasLogo()
    {
        Assert.assertTrue(new HomePage(driver).IsLogoDisplayed());
    }
}
