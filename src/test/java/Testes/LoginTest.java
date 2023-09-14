package Testes;

import Data.DataReader;
import Pages.Homepage;
import Pages.LoginPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase{

    LoginPage loginobject;
    Homepage homeobject;
@Test
    public void LoginSuccessfully() throws InterruptedException, IOException, ParseException {
        DataReader datareader=new DataReader();
        datareader.reader();

        loginobject=new LoginPage(driver);
        loginobject.Login(datareader.email, datareader.pass);
        homeobject=new Homepage(driver);
        homeobject.LogOut();
    }

}
