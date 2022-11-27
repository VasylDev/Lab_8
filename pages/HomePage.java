package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    private WebElement registerButton = driver.findElement(By.xpath("//span[@class]//a[contains(text(), 'Sign in')]"));
    private WebElement logo = driver.findElement(By.xpath("//img[contains(@src, 'https://ir.ebaystatic.com/rs/v/fxxj3ttftm5ltcqnto1o4baovyl.png')]"));


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public EmailLoginPage clickOnSighInButton()
    {
        registerButton.click();
        return new EmailLoginPage(driver);
    }
    public boolean IsLogoDisplayed()
    {
        waitForVisibilityElement(logo);
        return logo.isDisplayed();
    }
    public CategoryPage selectCategory(String categoryXPath, String subcategoryXpath)
    {
        WebElement category = driver.findElement(By.xpath(categoryXPath));
        WebElement subcategory = driver.findElement(By.xpath(subcategoryXpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(category).perform();
        waitForClicableElement(subcategory);
        subcategory.click();
        return new CategoryPage(driver);
    }

}
