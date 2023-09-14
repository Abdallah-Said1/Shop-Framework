package Testes;

import Data.DataReader;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckOutTest extends TestBase{
    CartPage cartobject;
    Homepage homeobject;
    ZaraPage zaraobject;
    LoginPage loginobject;

    @Test(description = "Login First" , priority = 1)
    public void LoginSuccessfully() throws InterruptedException, IOException, ParseException {
        DataReader datareader=new DataReader();
        datareader.reader();

        loginobject=new LoginPage(driver);
        loginobject.Login(datareader.email, datareader.pass);
    }

    @Test(description = "Search for ZARA And Add It TO Cart" , priority = 2)
    public void AddToCartSuccessfully() throws InterruptedException, IOException, ParseException {
        DataReader datareader=new DataReader();
        datareader.reader();

        homeobject=new Homepage(driver);
        homeobject.SearchForZaraProduct(datareader.Value);
        zaraobject=new ZaraPage(driver);
        zaraobject.Complit();
        zaraobject.AddZARAToCart();

    }
    @Test(description ="CheckOut Product" ,priority = 3)
    public void CheckOutProduct() throws IOException, ParseException, InterruptedException {
        DataReader datareader=new DataReader();
        datareader.reader();
        cartobject=new CartPage(driver);
        cartobject.ClickToCheckOut("Egy");
    }

}

