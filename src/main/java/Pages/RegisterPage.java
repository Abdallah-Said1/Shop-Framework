package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterPage {
  WebDriver driver;

  private final By LinkToRegister =By.cssSelector("a.btn1");
  private  final By FirstName =By.id("firstName");
    private  final By LastName =By.id("lastName");
    private  final By Email =By.id("userEmail");
    private final By PhoneNumber=By.id("userMobile");
    private final By Gender=By.xpath("//input[@type='radio']");
    private final By Password =By.id("userPassword");
    private final By ConfirmPassword=By.id("confirmPassword");
    private final By CheckboxAge = By.xpath("//input[@type='checkbox']");
    private final By RegisterButton= By.id("login");
    private final By SuccessRegister = By.cssSelector("h1.headcolor");
    private final By LinkToLogin =By.cssSelector("button.btn.btn-primary");


    public RegisterPage(WebDriver driver){
        this.driver=driver;

    }
    public RegisterPage ToOPenRegisterPage(){
        driver.findElement(LinkToRegister).click();
        return this;
    }
    public LoginPage ToRegister(String FName1,String LName1,String email1 ,String phone1,String Pass1, String ConfirmPass1) throws InterruptedException {
        driver.findElement(FirstName).sendKeys(FName1);
        driver.findElement(LastName).sendKeys(LName1);
        driver.findElement(Email).sendKeys(email1);
        driver.findElement(PhoneNumber).sendKeys(phone1);
        driver.findElement(Gender).click();
        driver.findElement(Password).sendKeys(Pass1);
        driver.findElement(ConfirmPassword).sendKeys(ConfirmPass1);
        driver.findElement(CheckboxAge).click();
        driver.findElement(RegisterButton).click();
        Thread.sleep(1500);
        WebElement successRegister= driver.findElement(SuccessRegister);
        Assert.assertTrue(successRegister.getText().equalsIgnoreCase("Account Created Successfully"));
        driver.findElement(LinkToLogin).click();
        Thread.sleep(1500);
        return new LoginPage(driver);

    }
}
