package api.stepdef;

import api.service.PotentivioAPI;
import io.cucumber.java.en.And;

public class RegisterStepDef {

    PotentivioAPI potentivioAPI = new PotentivioAPI();

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
