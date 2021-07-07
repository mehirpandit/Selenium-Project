import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/");

        Thread.sleep(50000);  // Let the user actually see something!

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("ChromeDriver");

        searchBox.submit();

        Thread.sleep(50000);  // Let the user actually see something!

        driver.quit();

    }

}