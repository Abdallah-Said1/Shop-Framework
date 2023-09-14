package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ZaraPage {
    WebDriver driver;
    private final By ContinueToShop = By.cssSelector("a.continue");
    private final By AddToCart =By.xpath("//div/button[1]");
    private final By SuccessAdd =By.id("toast-container");
    private final By AddToCartList = By.xpath("/html/body/app-root/app-product-details/app-sidebar/nav/ul/li[4]/button");
    private final By DeletButton = By.cssSelector("button.btn.btn-danger");
    private final By NOprouduct = By.xpath("/html/body/app-root/app-profile/div/div[2]/h1");

    public ZaraPage(WebDriver driver){
        this.driver=driver;
    }
    public void Complit(){
        WebElement Continue= driver.findElement(ContinueToShop);
        Continue.isDisplayed();
    }

    public void AddZARAToCart() throws InterruptedException {
        driver.findElement(AddToCart).click();
        WebElement successstoadd =driver.findElement(SuccessAdd);
        successstoadd.isDisplayed();
        Thread.sleep(1000);
        driver.findElement(AddToCartList).click();
        Thread.sleep(2500);
    }
    public void DeletFromCart(){
        driver.findElement(DeletButton).click();
        WebElement Noproduct= driver.findElement(NOprouduct);
        Assert.assertEquals(Noproduct.getText(),"No Products in Your Cart !");
    }
}
