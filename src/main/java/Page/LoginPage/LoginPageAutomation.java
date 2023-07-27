package Page.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.time.Duration.*;

public class LoginPageAutomation {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanup() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void TestLogin() {
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Element loginPage = new Element(driver);

        WebElement emailInput = wait.until(ExpectedConditions.visibilityOf(loginPage.getEmailInput()));
        emailInput.isDisplayed();
        emailInput.isEnabled();
        emailInput.sendKeys("Admin");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOf(loginPage.getPasswordInput()));
        passwordInput.sendKeys("admin123");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginPage.getLoginButton()));
        loginBtn.click();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement title = wait.until(ExpectedConditions.visibilityOf(loginPage.getTitleLoginSuccess()));
        String actualValue = title.getText();

        // Rest of your test code...
    }
}
