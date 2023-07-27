package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class MultiFrame {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        try {
            Thread.sleep(5000);
            List<WebElement> f = driver.findElements(By.tagName("frame"));

            System.out.println("Total Frames:"+ " "+ f.size());

            driver.switchTo().frame(1);
            Thread.sleep(2000);

            String BottomFrame = driver.findElement(By.tagName("body")).getText();
            Thread.sleep(2000);
            System.out.println(BottomFrame);
            driver.switchTo().parentFrame();
            driver.switchTo().frame("frame-top");
            driver.switchTo().frame("frame-left");
            Thread.sleep(2000);
            String LeftFrame = driver.findElement(By.tagName("body")).getText();
            Thread.sleep(2000);
            System.out.println(LeftFrame);
            driver.switchTo().defaultContent();
            Thread.sleep(2000);
            driver.quit();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
