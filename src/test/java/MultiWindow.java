import Xpaths.Xpath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultiWindow {
    public static void main(String[] args) throws InterruptedException {
        Xpath p=new Xpath();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(p.nxt);
        String parentwindow = driver.getWindowHandle();
        driver.findElement(By.xpath(p.BrowserTab)).click();
        //driver.findElement(By.xpath(p.Brochure)).click();
        Set<String> selenium = driver.getWindowHandles();
        for (String temp:selenium) {
            String title = driver.switchTo().window(temp).getTitle();
            if (title.equals("Demo Site – Multiple Windows – NxtGen A.I Academy")) {
                System.out.println(driver.findElement(By.className("copyright_text")).getText());
                break;

            }
        }
        for(String temp:selenium) {
            String title=driver.switchTo().window(temp).getTitle();
            if(title.equals("NxtGen A.I Academy – Automate Intelligently")) {
                System.out.println(driver.findElement(By.xpath("//li[starts-with(text(),'How to Obtain a Job')]")).getText());
                break;
            }
        }
        driver.switchTo().window(parentwindow);
        Thread.sleep(3000);
        driver.close();




    }
}
