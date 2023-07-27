import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;


public class TestClass {

    @Test
    public void Run() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(2000);
            WebElement emailInput = driver.findElement(By.name("username"));
            boolean isDisplay = emailInput.isDisplayed();
            System.out.println(isDisplay);
            emailInput.sendKeys("anhnam.ho2110@gmail.com");





        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }




}
