package api.stepdef;

import api.service.PotentivioAPI;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class RegisterStepDef {

    PotentivioAPI potentivioAPI = new PotentivioAPI();

    //register artist
    @When("user send POST Register artist request to potentivio")
    public void postregisterArtist() {
        potentivioAPI.postRegisterArtist();
    }

    @When("user send POST duplicate email Register request to potentivio")
    public void postDuplicateRegisterArtist() {
        potentivioAPI.duplicateRegisterArtist();}


    @When("user send POST Register artist with empty email request to potentivio")
    public void postRegisterArtistEmptyEmail() {
        potentivioAPI.postRegisterArtistEmptyEmail();
    }

    @When("user send POST Register artist with empty password request to potentivio")
    public void postRegisterArtistEmptyPassword() {
        potentivioAPI.postRegisterArtistEmptyPassword();
    }

    @When("user send POST Register artist with empty email and password request to potentivio")
    public void postRegisterArtistEmptyEmailPassword() {
        potentivioAPI.postRegisterArtistEmptyEmailPassword();
    }

    //register owner cafe
    @When("user send POST Register cafe owner request to potentivio")
    public void postRegisterCafeOwner() {
        potentivioAPI.postRegisterCafeOwner();
    }

    @When("user send POST duplicate email Register as Cafe Owner request to potentivio")
    public void duplicateEmailRegisterCafeOwner() {
        potentivioAPI.failedRegisterAsCafe();
    }


    @When("user send POST Register Cafe Owner with empty email request to potentivio")
    public void postRegisterCafeEmptyEmail() {
        potentivioAPI.postRegisterCafeEmptyEmail();
    }

    @When("user send POST Register Cafe Owner with empty password request to potentivio")
    public void postRegisterCafeEmptyPassword() {
        potentivioAPI.postRegisterCafeEmptyPassword();
    }


    @When("user send POST Register Cafe Owner with empty email and password request to potentivio")
    public void postRegisterCafeEmptyEmailPassword() {
        potentivioAPI.postRegisterCafeEmptyEmailPassword();
    }
}



