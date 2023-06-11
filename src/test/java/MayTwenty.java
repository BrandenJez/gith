import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MayTwenty {
    static WebDriver driver=null;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4)); //label[@for='fromCity']
        driver.manage().window().maximize();
        driver.get("https://makemytrip.com/");
        driver.findElement(By.xpath("")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
        driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("USA");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Concord, United States')]")));
        for( int i = 0;i<3;i++)
        {
            driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.xpath("//input[@placeholder='From']")).click();





    }
}
