import Xpaths.Xpath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Footlocker extends Xpath {
    public static void main(String[] args) throws InterruptedException {
        Xpath x= new Xpath();
        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get(x.shoes);
       driver.findElement(By.name("query")).sendKeys("Mens Jordans");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[@class='Icon Icon--search SearchForm-icon']")).click();
    }
}
