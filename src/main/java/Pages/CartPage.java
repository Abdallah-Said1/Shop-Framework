package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CartPage {
    WebDriver driver;
    private final By CheckOutButton= By.xpath("/html/body/app-root/app-profile/div/div[3]/ul/li[3]/button");
    private final By CountryName=By.xpath("/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/div[1]/div/input");
    private final By PlaceOrder=By.xpath("/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/div[2]/a");
    private final By SelectEGY = By.xpath("/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/div[1]/div/section/button/span");
    private final By THANKS =By.xpath("//td/h1[1]");
    private final By DownloadToExel =By.cssSelector("button.btn.btn-primary.mt-3.mb-3");
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickToCheckOut(String Cname) throws InterruptedException {
        driver.findElement(CheckOutButton).click();
        WebElement countryName= driver.findElement(CountryName);
        countryName.sendKeys(Cname);
        driver.findElement(SelectEGY).click();
        driver.findElement(PlaceOrder).click();
        WebElement Tanks =driver.findElement(THANKS);
        Assert.assertEquals(Tanks.getText(), "THANKYOU FOR THE ORDER.");
        driver.findElement(DownloadToExel).click();
    }

}
