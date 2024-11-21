package Tests;

import Pages.AccountPage;
import Pages.HelperClass;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest {
    WebDriver driver;
    HomePage homePage;
    AccountPage accountPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        accountPage = new AccountPage(driver);
        homePage.navigateToHomePage();
    }

    @Test
    public void verifyAddProduct() {
        homePage.clickOnCreateAccountBTN();
        accountPage.fillAccountDetails("Dalia", "Nassar", "Dalia" + HelperClass.getRandomInt() + "@gmail.com", "P@$$w0rd1232131");
        accountPage.navigateToHotSeller();
        homePage.chooseProducts(1);
        homePage.clickOnAddToCompareButton();
        accountPage.navigateToHotSeller();
        homePage.chooseProducts(2);
        homePage.clickOnAddToCompareButton();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
