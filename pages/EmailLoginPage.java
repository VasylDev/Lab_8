package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigurationReader;

public class EmailLoginPage extends BasePage{
    private WebElement emailField = driver.findElement(By.xpath("//input[@name = 'userid']"));
    private WebElement continueButton = driver.findElement(By.xpath("//button[@name = 'signin-continue-btn']"));
    private final String USER_EMAIL = ConfigurationReader.get().getUserEmail();

    public EmailLoginPage(WebDriver driver)
    {
        super(driver);
    }
    public EnterPasswordPage EnterEmail()
    {
        emailField.sendKeys(USER_EMAIL);
        continueButton.click();
        return new EnterPasswordPage(driver);
    }

}
