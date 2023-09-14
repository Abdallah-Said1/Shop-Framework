package Testes;

import Data.DataReader;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.ZaraPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class DeletFromCart extends TestBase{
    ZaraPage zaraobject;
    Homepage homeobject;
    LoginPage loginobject;

    @Test(description = "Login First" , priority = 1)
    public void LoginSuccessfully() throws InterruptedException, IOException, ParseException {
        DataReader datareader=new DataReader();
        datareader.reader();

        loginobject=new LoginPage(driver);
        loginobject.Login(datareader.email, datareader.pass);
    }
    @Test(description = "Search By Categories" ,priority = 2)
    public void SearchCategories() throws InterruptedException {
        homeobject=new Homepage(driver);
        homeobject.SearchByCategories();
    }
    @Test(description = "Delet from Cart" , priority = 3)
    public void deletProductFromCart() throws InterruptedException {
        zaraobject=new ZaraPage(driver);
        zaraobject.Complit();
        zaraobject.AddZARAToCart();
        zaraobject.DeletFromCart();
    }
}
