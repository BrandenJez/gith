import Xpaths.Xpath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumHW extends Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Changes made in repository")
        System.out.println("Added Changes Here");
        WebDriverManager.chromedriver();
        Xpath p=new Xpath();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(p.url);
        WebElement search = driver.findElement(By.xpath(p.searchBox));
        search.sendKeys(p.arr[0]);
        WebElement but = driver.findElement(By.xpath(p.searchButton));
        but.click();
        Thread.sleep(5000);
        WebElement song = driver.findElement(By.xpath(p.s1));
        song.click();
        Thread.sleep(60000);
        search.clear();
        Thread.sleep(5000);
        search.sendKeys(p.arr[1]);
        but.click();
        Thread.sleep(5000);
        //WebElement song2 = driver.findElement(By.xpath(p.s2));
        //song2.click();
        song.click();
        Thread.sleep(60000);
        search.clear();
        Thread.sleep(5000);
        search.sendKeys(p.arr[2]);
        but.click();
        Thread.sleep(5000);
        //WebElement song3 = driver.findElement(By.xpath(p.s3));
        //song3.click();
        song.click();
        Thread.sleep(60000);
        driver.close();
    }
}
