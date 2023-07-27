package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        try {
            Thread.sleep(2000);
            WebElement dropDownButton = driver.findElement(By.id("dropdownMenuButton"));
            dropDownButton.click();
            Thread.sleep(2000);
            WebElement option = driver.findElement(By.xpath("(//a[@class='dropdown-item'][normalize-space()='Datepicker'])[2]"));
            option.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
