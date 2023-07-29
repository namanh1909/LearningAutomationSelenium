package UploadFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        try {
            Thread.sleep(2000);
            WebElement uploadInput = driver.findElement(By.id("file-upload"));
            uploadInput.sendKeys("/Users/hoanhnam/Downloads/CV_HoAnhNam_ReactDeveloper.pdf");
            Thread.sleep(2000);
            driver.findElement(By.id("file-submit")).click();
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
