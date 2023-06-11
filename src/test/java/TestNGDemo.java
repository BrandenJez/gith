import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class TestNGDemo {
    WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
    @Test(priority = 1)
    public void methodC()
    {

        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("1234");

    }
        @Test(priority = 2)
        public void method2()
        {

            driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("1234");

        }
        @AfterMethod
        public void teardown()
        {
            driver.quit();
        }
}
