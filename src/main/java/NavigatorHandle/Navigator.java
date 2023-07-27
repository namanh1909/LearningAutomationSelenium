package NavigatorHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigator {
    @Test
    public void Test()  {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
            driver.get("https://www.facebook.com/");
            Thread.sleep(2000);
            driver.navigate().to("https://www.google.com");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().forward();
            Thread.sleep(2000);
            driver.navigate().refresh();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//

//        Thread.sleep(3000);
        driver.quit();

    }
}
