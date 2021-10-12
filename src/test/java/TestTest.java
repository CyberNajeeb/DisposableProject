import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class TestTest {

    @Test
    public void test() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("q"))));
        driver.findElement(By.name("q")).sendKeys("Java Books", Keys.ENTER);
        Thread.sleep(1000);
        driver.navigate().back();
        driver.navigate().to("https://amazon.com");
        Thread.sleep(1000);
        driver.quit();

    }
}
