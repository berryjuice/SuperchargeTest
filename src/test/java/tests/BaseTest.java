package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected static final String BROWSER = System.getenv("browser") != null ? System.getenv("browser") : "chrome";
    protected static WebDriver driver;

    @BeforeAll
    protected static void setUp() throws MalformedURLException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterAll
    protected static void tearDown() {
        if (driver != null) {driver.quit();}
    }
}
