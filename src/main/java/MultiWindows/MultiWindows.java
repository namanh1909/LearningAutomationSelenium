package MultiWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiWindows {
    @Test
    public void Test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        try {
            Thread.sleep(2000);
            String MainTab = driver.getWindowHandle();
            System.out.println(MainTab);
            driver.switchTo().newWindow(WindowType.TAB); // change to windows
            driver.get("https://www.google.com/");
            System.out.println(driver.getTitle());
            System.out.println(driver.getWindowHandles());
            Thread.sleep(2000);
            driver.switchTo().window(MainTab);
            Thread.sleep(2000);
            System.out.println(driver.getTitle());
            driver.close();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }


}
