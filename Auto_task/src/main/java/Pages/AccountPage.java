package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    By firstNameInput = By.id("firstname");
    By lastnameInput = By.id("lastname");
    By email_addressInput = By.id("email_address");
    By passwordInput = By.id("password");
    By passwordConfirmationInput = By.id("password-confirmation");
    By submitCreateAccount = By.xpath("//button[@title='Create an Account']");
    By logo = By.xpath("//a[@class='logo']");
    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillAccountDetails(String firstName, String lastName, String email, String password) {
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastnameInput).sendKeys(lastName);
        driver.findElement(email_addressInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(passwordConfirmationInput).sendKeys(password);
        driver.findElement(submitCreateAccount).click();
    }

    public void navigateToHotSeller() {
        driver.findElement(logo).click();
    }
}
