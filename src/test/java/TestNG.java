import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class TestNG {
    @Test
    public static void methodD()
    {
       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=33");
        //String res=driver.findElement(By.xpath("//a[text()='Cameras']")).getText();*/
        //String res=null;
        //Assert.assertNull(res);
        Assert.fail("Test object not found");
    }

}
