package Page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {
    private WebDriver driver;
    public Element(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.name("username"));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.name("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    }

    public WebElement getTitleLoginSuccess() {
        return driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
    }
}
