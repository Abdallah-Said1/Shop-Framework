package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    private final By ForgPass = By.cssSelector("a.forgot-password-link");

    private final By UserEmail =By.id("userEmail");
    private final By UserPassword=By.id("userPassword");
    private final  By LoginButton =By.id("login");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage LinkLoginSuccess(){
        WebElement Inlogin =  driver.findElement(ForgPass);
        Inlogin.isDisplayed();

        return this;
    }

    public Homepage Login(String Email, String Passowrd) throws InterruptedException {
        driver.findElement(UserEmail).sendKeys(Email);
        driver.findElement(UserPassword).sendKeys(Passowrd);
        driver.findElement(LoginButton).click();
        Thread.sleep(2000);
        return new Homepage(driver);

    }
}
