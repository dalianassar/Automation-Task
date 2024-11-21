package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    String URL = "https://magento.softwaretestingboard.com/";
    By createAccountBTN = By.xpath("//a[contains(.,'Create an Account')]");
    By addToCompareBtn = By.xpath("//span[contains(.,'Add to Compare')]");

    private By chooseProduct(int index) {
        return By.xpath("(//img[@class='product-image-photo'])[" + index + "]");
    }

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver.navigate().to(URL);
    }

    public void clickOnCreateAccountBTN() {
        driver.findElement(createAccountBTN).click();
    }

    public void chooseProducts(int index) {
        driver.findElement(chooseProduct(index)).click();
    }

    public void clickOnAddToCompareButton() {
        driver.findElement(addToCompareBtn).click();
    }


}
