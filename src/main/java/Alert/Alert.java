package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        try {
            driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Alert\"]")).click();
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
            driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Confirm\"]")).click();
            Thread.sleep(5000);
            driver.switchTo().alert().dismiss();
            driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Prompt\"]")).click();
            Thread.sleep(5000);
            driver.switchTo().alert().sendKeys("Hey I am provinding data in Javascript popup");
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
