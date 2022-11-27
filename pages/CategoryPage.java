package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryPage extends BasePage{
    private List<WebElement> searchResults = driver.findElements(By.xpath("//li[@class = 's-item s-item--large']"));
    public CategoryPage(WebDriver driver) {
        super(driver);
    }
    public boolean IsCategoryEmpty()
    {
        return searchResults.isEmpty();
    }
}
