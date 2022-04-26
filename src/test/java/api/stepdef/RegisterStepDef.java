package api.stepdef;

import api.service.potentivio.RegisterAPI;
import io.cucumber.java.en.And;

public class RegisterStepDef {

    RegisterAPI registerAPI = new RegisterAPI();

    @And("user send POST Register artist request to potentivio")
    public void postregisterArtist() {
        registerAPI.postRegisterArtist();
    }

    @And("user send POST failed Register artist request to potentivio")
    public void failedPostRegisterArtist() {
        registerAPI.failedPostRegisterArtist();
    }

    @And("user send POST Register cafe owner request to potentivio")
    public void postregisterCafeOwner() {
        registerAPI.postRegisterCafeOwner();
    }
}
