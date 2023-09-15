package runner;

import Testes.TestBase;
import io.cucumber.testng.CucumberOptions;
import steps.UserLogin;

@CucumberOptions(
        features = "E://automation testing//Shop-AutomationTest//src//test//java//Features",
        glue = {"steps"},
        plugin = {"pretty","html:target/cucumber-html-report"})

public class LoginRunner extends TestBase {

}
