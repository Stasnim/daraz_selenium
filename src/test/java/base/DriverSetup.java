package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class DriverSetup {

    WebDriver driver = null;

    @BeforeSuite
    public void setUp() {

        String browser = System.getProperty("browser", "chrome");

        if (browser.contains("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();

        } else if (browser.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.daraz.com.bd/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        PageDriver.getInstance().setDriver(driver);
    }

    @AfterSuite
    public void tearDown() {
        PageDriver.getCurrentDriver().quit();

    }

}


