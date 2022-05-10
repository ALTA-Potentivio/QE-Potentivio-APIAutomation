package api.stepdef;

import api.service.PotentivioAPI;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class RegisterStepDef {

    PotentivioAPI potentivioAPI = new PotentivioAPI();


    @When("user send POST duplicate email Register request to potentivio")
    public void postduplicateregisterArtist() { potentivioAPI.duplicateRegisterArtist();}

    @When("user send POST Register artist using Email special character request to potentivio")
    public void postspecialcharacterregisterArtist() { potentivioAPI.specialcharacterRegisterArtist();}

    @When("user send POST Register artist the data not complete request to potentivio")
    public void postincompleteregisterArtist() { potentivioAPI.incompletedRegisterArtist();}

    @When("user send POST duplicate email Register As Cafe Owner request to potentivio")
    public void failedpostduplicateregistercafeowner() { potentivioAPI.postfailedRegisterCafeOwner();}

    @When("user send POST Register Cafe Owner with Email special character request to potentivio")
    public void failedpostwithemailspecialcharacter() { potentivioAPI.failedRegisterAsCafe();}

    @When("user send POST Register Cafe Owner the data not complete request to potentivio")
    public void failedpostdataincompleted() { potentivioAPI.incompletedRegisterAsCafe();}

    @And("user send POST Register artist request to potentivio")
    public void postregisterArtist() {
        potentivioAPI.postRegisterArtist();
    }

    @And("user send POST failed Register artist request to potentivio")
    public void failedPostRegisterArtist() {
        potentivioAPI.failedPostRegisterArtist();
    }

    @And("user send POST Register cafe owner request to potentivio")
    public void postregisterCafeOwner() {
        potentivioAPI.postRegisterCafeOwner();
    }

}



