package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    WebDriver driver;

    private final By SearchText =By.xpath("(//input[@name='search'])[2]");
    private final By ViewButton =By.cssSelector("button.btn.w-40.rounded");
    private final By minprice= By.xpath("(//input[@name='minPrice'])[2][1]");
    private final By maxprice =By.xpath("//div/input[1]"); //error
    private final By Categories =By.xpath("//body/app-root[1]/app-dashboard[1]/section[1]/form[1]/div[3]/div[2]/input[1]");
    private final By Image = By.cssSelector("img.card-img-top");
    private final By LogOut =By.xpath("//ul/li[5]");




    public Homepage(WebDriver driver){
        this.driver=driver;
    }

    public void LogOut(){
        driver.findElement(LogOut).click();
    }

    public void SearchForZaraProduct(String Value) throws InterruptedException {
        WebElement SearchZa =driver.findElement(SearchText);
        SearchZa.sendKeys(Value);
        SearchZa.submit();
        Thread.sleep(1000);
        driver.findElement(ViewButton).click();
       Thread.sleep(1000);
    }



    public void SearchByCategories() throws InterruptedException {
        driver.findElement(Categories).click();
        Thread.sleep(1000);
        WebElement image =driver.findElement(Image);
        image.isDisplayed();
        driver.findElement(ViewButton).click();
        Thread.sleep(2500);


    }
}
