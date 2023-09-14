package steps;

import Pages.LoginPage;
import Testes.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLogin extends TestBase {
    LoginPage loginobject;

    @Given("i entered data user {string} ,{string}")
    public void i_entered_data_user(String email, String password) throws InterruptedException {
        loginobject=new LoginPage(driver);
        loginobject.Login(email, password);
    }
    @Then("the User can Login Successfully")
    public void the_user_can_login_successfully() {

    }
}
