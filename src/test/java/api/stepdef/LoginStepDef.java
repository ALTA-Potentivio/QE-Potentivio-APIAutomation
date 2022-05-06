package api.stepdef;

import api.service.PotentivioAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class LoginStepDef {

    PotentivioAPI potentivioAPI = new PotentivioAPI();


    @When("user send POST login artist request to potentivio")
    public void postloginArtist() {
        potentivioAPI.postLoginArtist();


    @And("user send POST wrong password login artist request to potentivio")
    public void wrongpasswordLoginArtist() {
        potentivioAPI.wrongpasswordLoginArtist();
    }

    @And("user send POST wrong email login artist request to potentivio")
    public void wrongemailLoginArtist() {
        potentivioAPI.wrongemailLoginArtist();
    }

    @And("user send POST without password login artist request to potentivio")
    public void emptypasswordloginArtist() {
        potentivioAPI.emptypasswordLoginArtist();
    }

    @And("user send POST without email login artist request to potentivio")
    public void emptyemailloginArtist() {
        potentivioAPI.emptyemailLoginArtist();
    }

    @And("user send POST without email and password login artist request to potentivio")
    public void emptyemailpassartist() {
        potentivioAPI.emptyemailpassArtist();
    }

    @And("user send POST with unregistered account login artist request to potentivio")
    public void unregisteredartist() {
        potentivioAPI.unregisteredArtist();
    }

    @And("user send POST login cafe owner request to potentivio")
    public void postloginCafeOwner() {
        potentivioAPI.postLoginCafeOwner();
    }

    @And("user send POST wrong password login cafe owner request to potentivio")
    public void wrongpasswordLoginCafeOwner() {
        potentivioAPI.wrongpasswordloginCafeOwner();
    }
    @And("user send POST wrong email login cafe owner request to potentivio")
    public void wrongemailLoginCafeOwner() {
        potentivioAPI.wrongemailloginCafeOwner();
    }
    @And("user send POST without password login cafe owner request to potentivio")
    public void emptypasswordloginCafeOwner() {
        potentivioAPI.emptypasswordLoginACafeOwner();
    }
    @And("user send POST without email login cafe owner request to potentivio")
    public void emptyemailloginCafeOwner() {
        potentivioAPI.emptyemailLoginCafeOwner();
    }

    @And("user send POST without email and password login cafe owner request to potentivio")
    public void emptyemailpasscafeowner() {
        potentivioAPI.emptyemailpassCafeOwner();
    }

    @And("user send POST with unregistered account login cafe owner request to potentivio")
    public void unregisteredcafeowner() {
        potentivioAPI.unregisteredCafeOwner();
    }

    }
