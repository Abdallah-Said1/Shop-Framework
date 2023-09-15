package Testes;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilites.helper;

import java.util.concurrent.TimeUnit;

public class TestBase extends AbstractTestNGCucumberTests {
public WebDriver driver;
    @Parameters({"browser"})
    @BeforeClass

    public void OpenBrwoser(@Optional("chrome") String BrwosrerName)
{
    if (BrwosrerName.equalsIgnoreCase("chrome"))
    {
    driver=new ChromeDriver();

    }
   else if (BrwosrerName.equalsIgnoreCase("firefox"))
    {
     driver=new FirefoxDriver();

    } else if (BrwosrerName.equalsIgnoreCase("ie"))
    {
    driver=new InternetExplorerDriver();
    }
    else if (BrwosrerName.equalsIgnoreCase("headless"))
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
    }
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   driver.navigate().to("https://rahulshettyacademy.com/client");
}
@AfterClass
    public void CloseBrwoser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
}
@AfterMethod
    public void TackScreen(ITestResult result){
        if (result.getStatus()==ITestResult.FAILURE){
            System.out.println("Failed!");
            System.out.println("Wait To Take Screenshot Of Failure ..");
            helper.TackScreenShot(driver,result.getName());
        }
}
}
