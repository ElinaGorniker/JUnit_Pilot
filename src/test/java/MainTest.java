import org.example.ConfProperties;
import org.example.Driver;
import org.example.HomePage;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;




public class MainTest {

    public static WebDriver driver;
    @BeforeAll
    public static void setup(){
        System.setProperty(ConfProperties.getProperty("chromedriver_route"), ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("home_page"));
    }

    @Test
    public void homePageSmokeTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getTitle().contains(ConfProperties.getProperty("home_page_title"));



    }
}
