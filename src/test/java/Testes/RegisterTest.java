package Testes;

import Data.DataReader;
import Pages.RegisterPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends TestBase{
RegisterPage RegisterObject;
    @Test(description = "Register")
    public void RegisterSuccess() throws InterruptedException, IOException, ParseException {
    DataReader datareader=new DataReader();
    datareader.reader();

    RegisterObject=new RegisterPage(driver);
    RegisterObject.ToOPenRegisterPage();
    RegisterObject.ToRegister(datareader.Fname,datareader.Lname,datareader.email,datareader.phonNumber,datareader.pass,datareader.pass);

    }
}
