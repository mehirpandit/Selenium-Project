import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class TestFormPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Max");
        driver.findElement(By.id("last-name")).sendKeys("Steel");

        driver.findElement(By.id("job-title")).sendKeys("Web Developer");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("07/07/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        //Thread.sleep(5000);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!", alertText);
        System.out.println(alertText);

        driver.close();

    }


}
