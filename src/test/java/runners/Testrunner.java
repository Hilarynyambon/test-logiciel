package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.RegisterPage;
import org.example.pageObject.Logout;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"

        },
        features = "src/test/resources/feature/accounte.feature",
        glue = {"stepdefinition","src/main/java/org/example/pageObject"}
)



public class Testrunner extends AbstractTestNGCucumberTests {
        LoginPage loginPage = new LoginPage();
        RegisterPage registerPage=new RegisterPage();
        HomePage homePage = new HomePage();
        Logout singout = new Logout();

        @Test
        public  void loginPage() throws InterruptedException {
                loginPage.login();

        }
        @Test
        public  void  registerPage(){
                registerPage.singUp();
        }
        @Test
        public void homepage(){
                homePage.navigate();
//                homePage.fillemail();
//                homePage.fillpassword();
//                homePage.login(email,password);
        }



}
