package Testes;

import Data.DataReader;
import Pages.Homepage;
import Pages.LoginPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTest extends TestBase{
    Homepage homeobject;
    LoginPage loginobject;

    @Test(description = "Login First" , priority = 1)
    public void LoginSuccessfully() throws InterruptedException, IOException, ParseException {
        DataReader datareader=new DataReader();
        datareader.reader();

        loginobject=new LoginPage(driver);
        loginobject.Login(datareader.email, datareader.pass);
    }

    @Test(description = "Search for ZARA" , priority = 2)
    public void SearchSuccessfully() throws InterruptedException, IOException, ParseException {
        DataReader datareader=new DataReader();
        datareader.reader();

        homeobject=new Homepage(driver);
        homeobject.SearchForZaraProduct(datareader.Value);
    }


}
