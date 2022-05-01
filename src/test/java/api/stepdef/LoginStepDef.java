package api.stepdef;

import api.service.PotentivioAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


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
}
