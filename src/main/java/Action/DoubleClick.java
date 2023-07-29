package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.plus2net.com/jquery/msg-demo/event-dblclick.php");
        try {
            Thread.sleep(2000);
            WebElement doubleClickButton = driver.findElement(By.id("b1"));
            Actions act = new Actions(driver);
            act.doubleClick(doubleClickButton).build().perform();
            //another method
            //click and hold
                // act.clickAndHold(doubleClickButton).build().perform();
            //

            Thread.sleep(3000);
            //find element check box and click

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
