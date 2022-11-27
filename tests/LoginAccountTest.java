package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginAccountTest extends BaseTest{
    private static final String MESSAGE = "Successful login";

    @Test
    public void createAccountTest() {
        String actualMessage = new HomePage(driver)
                .clickOnSighInButton()
                .EnterEmail()
                .EnterPassword()
                .GetActualMessage();
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }
}
