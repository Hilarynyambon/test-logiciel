package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.testng.annotations.Test;

public class HomeStep {
    private  HomePage homeStep = new  HomePage();
 @Given( "user in the page")
 public void  userInhomePagr(){
        homeStep.navigate();
    }
    @When ("user click avtar in navbar")
    public void uselinckAvatar(){}

    @Then(
            "modal is open"
    )
    public void modalIsopen(){}
}
