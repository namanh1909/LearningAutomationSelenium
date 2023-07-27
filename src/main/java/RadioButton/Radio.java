package RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {

    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        try {
            Thread.sleep(5000);
            //find element check box and click
            WebElement radioButton = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
            radioButton.click();
            radioButton.isDisplayed();
            radioButton.isEnabled();
            radioButton.isSelected();
            System.out.println(radioButton.getText());
            Thread.sleep(2000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
