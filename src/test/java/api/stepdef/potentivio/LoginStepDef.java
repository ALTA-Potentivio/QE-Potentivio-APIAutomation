package api.stepdef.potentivio;

import api.service.potentivio.LoginArtistAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginStepDef {

    LoginArtistAPI loginArtistAPI = new LoginArtistAPI();

    //action

    @And("user send POST login artist request to potentivio")
    public void postloginArtist() {
        loginArtistAPI.postLoginArtist();
    }

    //validation
    @Then("response status code should be {int}")
    public void statusCodeValidation(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Then("response structure should match json schema {string}")
    public void validateJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }
}
