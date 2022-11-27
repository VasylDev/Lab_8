package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSuccess extends BasePage{
    private WebElement actualButtonMessage = driver.findElement(By.xpath("//button[contains(text(), 'Hi')]"));
    private final String successMessage = "Successful login";
    private final String failMessage = "Fail login";
    public LoginSuccess(WebDriver driver) {
        super(driver);
    }
    public String GetActualMessage()
    {
        waitForVisibilityElement(actualButtonMessage);
        if(actualButtonMessage.isDisplayed())
            return successMessage;
        else
            return failMessage;
    }

}
