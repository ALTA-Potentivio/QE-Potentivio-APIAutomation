package api.stepdef;

import api.service.PotentivioAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginStepDef {

    PotentivioAPI potentivioAPI = new PotentivioAPI();


    @When("user send POST login artist request to potentivio")
    public void postloginArtist() {
        potentivioAPI.postLoginArtist();
    }

    @And("user send POST failed login artist request to potentivio")
    public void failedPostloginArtist() {
        potentivioAPI.failedPostLoginArtist();
    }

    @And("user send POST login cafe owner request to potentivio")
    public void postloginCafeOwner() {
        potentivioAPI.postLoginCafeOwner();
    }
//
//    @Given("user has already had login as artist")
//    public void userHasAlreadyHadLoginAsArtist() {
//        this.tokenGenerated= loginAPI.bearerTokenAuthenticationTestLoginArtist();
//    }

//    @Given("user has already had login token as artist")
//    public void userHasAlreadyHadLoginTokenAsArtist() throws Exception {
//        this.tokenGenerated = loginAPI.getBearerToken();
//    }
//
//
//    @When("user send GET request to see the current user data")
//    public void userSendGETRequestToSeeTheCurrentUserData() {
//        loginAPI.authMe(tokenGenerated);
//    }
//
//    @Given("user hasn't already had login token as artist")
//    public void userHasnTAlreadyHadLoginTokenAsArtist() {
//        this.tokenGenerated = "null";
//    }


    }

