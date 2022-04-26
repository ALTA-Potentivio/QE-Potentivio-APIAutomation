package api.stepdef;

import api.service.potentivio.LoginAPI;
import api.service.potentivio.RegisterAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginStepDef {

    LoginAPI loginAPI = new LoginAPI();

    @And("user send POST login artist request to potentivio")
    public void postloginArtist() {
        loginAPI.postLoginArtist();
    }

    @And("user send POST failed login artist request to potentivio")
    public void failedPostloginArtist() {
        loginAPI.failedPostLoginArtist();
    }

    @And("user send POST login cafe owner request to potentivio")
    public void postloginCafeOwner() {
        loginAPI.postLoginCafeOwner();
    }

}
