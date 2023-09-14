package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OrdersPage  {
    WebDriver driver;
    private final By Orders=By.xpath("//ul/li[3]");
    private final By View=By.cssSelector("button.btn.btn-primary");
    private final By YourOrder =By.xpath("//div/h1");
    private final By ThanksUs=By.cssSelector("p.tagline");
    private final By Delet =By.cssSelector("button.btn.btn-danger");


    public OrdersPage(WebDriver driver){
        this.driver=driver;
    }
    public void ViewOrder(){
        driver.findElement(Orders).click();
        WebElement Yourorder=driver.findElement(YourOrder);
        Assert.assertEquals(Yourorder.getText(),"Your Orders");
        driver.findElement(View).click();
        WebElement thanksUS=driver.findElement(ThanksUs);
        Assert.assertEquals(thanksUS.getText(),"Thank you for Shopping With Us");
    }
    public void DeletOrder(){
        driver.findElement(Orders).click();
        WebElement Yourorder=driver.findElement(YourOrder);
        Assert.assertEquals(Yourorder.getText(),"Your Orders");
        driver.findElement(Delet).click();

    }
}
