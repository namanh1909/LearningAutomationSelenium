package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Wait {
    //Implicit wait:
    // apply to all element, define the max time wait -> send notify No Such Element Exception
    // Nên được sử dụng với những thành phần có thể được xác định trong khung thời gian được chỉ định trong Implicit wait
    //Explicit wait: define the max time wait -> and then can give a another options
    //Nên sử dụng với những thành phần mất nhiều thời gian để tải,
    // hoặc để kiểm tra các thuộc tính của phần tử như (visualOfEuityLocated, ElementToBeClickable, ElementToBeSelected)
    @Test
    public void TestWait() {
        WebDriver driver = new ChromeDriver();
        //set Inplicit Wait với thời gian timeout là 10 giây
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Inplicit Wait
        driver.get("https://www.google.com");

        WebElement searchInput = driver.findElement(By.id("APjFqb"));
        searchInput.sendKeys("namdeptrai");
        WebElement btnSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        btnSearch.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abc"))); // wait to find element
//        element.click();
        //Phần tử này sẽ được chờ đợi load lên trong khung thời gian là 10s
         WebElement elementLink = driver.findElement(By.xpath("//h3[contains(text(),'Dàn \"nam thần\" bơi lội Việt Nam đẹp trai, vạm vỡ đ')]"));

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(2L))
                .ignoring(NoSuchElementException.class);

        // wait 30s to find element
        // use manual test to next page

        WebElement foo = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if(elementLink.isEnabled()){
                    System.out.println("Element found");
                }
                return elementLink;
            }
        });
        elementLink.click();

        driver.quit();

    }

}
