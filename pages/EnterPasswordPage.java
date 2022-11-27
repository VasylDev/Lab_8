package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigurationReader;

public class EnterPasswordPage extends BasePage{
    private WebElement passwordField = driver.findElement(By.xpath("//input[@name = 'pass']"));
    private WebElement sighInButton = driver.findElement(By.xpath("//button[@name = 'sgnBt']"));
    private final String USER_PASSWORD = ConfigurationReader.get().getPassword();
    public EnterPasswordPage(WebDriver driver) {
        super(driver);
    }
    public LoginSuccess EnterPassword()
    {
        waitForClicableElement(passwordField);
        passwordField.sendKeys(USER_PASSWORD);
        sighInButton.click();
        return new LoginSuccess(driver);
    }

}
