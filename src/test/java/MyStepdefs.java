import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^User is  on Home page$")
    public void userIsOnHomePage() throws Throwable {
        System.out.println("User is  on Home page");

    }

    @When("^user navigate to login page$")
    public void userNavigateToLoginPage() throws Throwable {
        System.out.println("user navigate to login page");
    }

    @And("^User enters username and password$")
    public void userEntersUsernameAndPassword() throws Throwable {
        System.out.println("User enters username and password");
    }

    @Then("^Message displayed login Succseefully$")
    public void messageDisplayedLoginSuccseefully() throws Throwable {
        System.out.println("Message displayed login Succseefully");
    }
}
