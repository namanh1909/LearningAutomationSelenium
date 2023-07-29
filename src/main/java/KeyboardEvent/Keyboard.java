package KeyboardEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
            Thread.sleep(2000);
            WebElement userNameInput = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            userNameInput.sendKeys("Admin");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.click(userNameInput).sendKeys(Keys.TAB).sendKeys("admin123").sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
