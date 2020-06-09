import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.i.ua/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testCorrectLogin() throws InterruptedException {
        WebElement login = driver.findElement(By.cssSelector("input[name=\"login\"]"));
        login.sendKeys("ingvarius@i.ua");
        WebElement password = driver.findElement(By.cssSelector("input[name=\"pass\"]"));
        password.sendKeys("Addmin1!");
        password.submit();

        Thread.sleep(1000);
        WebElement Inbox = driver.findElement(By.xpath("//div[@class=\"folder_title clear\"]"));
        String inboxLabel = Inbox.getText();
        Assert.assertTrue(inboxLabel.contains("Вхідні"));
    }

    @Test
    public void testIncorretLogin() throws InterruptedException {
        WebElement login = driver.findElement(By.cssSelector("input[name=\"login\"]"));
        login.sendKeys("111111");
        WebElement password = driver.findElement(By.cssSelector("input[name=\"pass\"]"));
        password.sendKeys("222222");
        password.submit();

        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("login"));
    }
}