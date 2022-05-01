package api.stepdef;

import io.cucumber.java.en.Then;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ValidationStepDef {
    //validation
    @Then("response status code should be {int}")
    public void statusCodeValidation(int responseCode) {
        restAssuredThat(response -> response.statusCode(responseCode));
    }

    @Then("response structure should match json schema {string} from {string}")
    public void validateJsonSchema(String schema, String folderSchema) {
        String schemaPath = String.format("schema/%s/%s", folderSchema, schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(schemaPath)));
    }
}
