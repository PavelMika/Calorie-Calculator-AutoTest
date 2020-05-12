package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import pages.CalculatorPage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import utils.CapabilitiesGenerator;
import utils.TestListener;

import java.util.concurrent.TimeUnit;
@Listeners(TestListener.class)
@Log4j2
public class BaseTest {

    private WebDriver driver;
    protected  CalculatorPage calculatorPage;
    int timeout = 20;
    @BeforeMethod
    public void setDriver(ITestContext context){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        log.debug("Setup Implicit Wait to" + timeout);
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        calculatorPage = new CalculatorPage(driver);
        context.setAttribute("driver", driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver(){
        driver.quit();
    }
}
