package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandle {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        try {
            Thread.sleep(5000);
            //find element check box and click
            driver.switchTo().frame("mce_0_ifr");
            WebElement frameInputValue = driver.findElement(By.id("tinymce"));
            Thread.sleep(2000);
            frameInputValue.clear();
            Thread.sleep(2000);
            frameInputValue.sendKeys("new value");
            Thread.sleep(2000);
            driver.switchTo().defaultContent();
            Thread.sleep(5000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
