package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownSelectionOption {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        try {
            Thread.sleep(2000);
            Select obj = new Select(driver.findElement(By.id("dropdown")));
            Thread.sleep(2000);
            obj.selectByVisibleText("Option 1");
            Thread.sleep(2000);
//            obj.selectByIndex(1);
            List<WebElement> dropdownValueCount = obj.getOptions();
            System.out.println("size" + dropdownValueCount.size());
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
