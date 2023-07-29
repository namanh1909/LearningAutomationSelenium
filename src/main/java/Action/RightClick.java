package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class RightClick {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/");
        try {
            Thread.sleep(2000);
            WebElement downloadButton = driver.findElement(By.xpath("//a[@href='/downloads']"));
            Actions act = new Actions(driver);
            act.contextClick(downloadButton).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(3000);
            //find element check box and click

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
