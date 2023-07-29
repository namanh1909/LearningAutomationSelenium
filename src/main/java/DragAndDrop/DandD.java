package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DandD {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        try {
            Thread.sleep(2000);
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement droppable = driver.findElement(By.id("droppable"));
            Actions act = new Actions(driver);
            Thread.sleep(2000);
            act.dragAndDrop(draggable, droppable).build().perform();
            Thread.sleep(3000);

            // to resize element use dragAndDropBy(Element, X , Y)

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
