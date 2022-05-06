package api.stepdef;

import api.service.PotentivioAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PotentivioStepDef {

    PotentivioAPI potentivioAPI = new PotentivioAPI();
//    String URL;

    @Given("user has already had login token as artist")
    public void userHasAlreadyHadLoginTokeAsArtist() {
        potentivioAPI.setTokenArtist();
    }
    @Given("user has already had login token as cafe-owner")
    public void userHasAlreadyHadLoginTokenAsCafe() {
        potentivioAPI.setTokenCafeOwner();
    }
    @Given("user has not already had login token")
    public void userHasNotAlreadyHadLoginToken() {
        potentivioAPI.setTokenNoLogin("null");
    }

    @When("user send GET All Artist request to potentivio")
    public void getallArtist()  {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.getAllArtist(potentivioAPI.getTokenCafeOwner());
    }

    @And("user send GET Profile Artist request to potentivio")
    public void getProfileArtist() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.getProfileArtist(potentivioAPI.getTokenArtist());
    }

    @And("user send GET Detail Artist request to potentivio")
    public void getDetailArtist() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.getDetailArtist(potentivioAPI.getTokenCafeOwner());
    }

    @And("user send PUT Update Artist request to potentivio")
    public void putUpdateArtist() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.putUpdateArtist(potentivioAPI.getTokenArtist());
    }


    @When("user send GET All Artist request to potentivio but not login")
    public void userSendUnsuccessGETAllArtistRequestToPotentivio() {
        potentivioAPI.unsuccessGetAllArtist();
    }

    @When("user send DELETE Artist request to potentivio")
    public void userSendDELETEArtistRequestToPotentivio() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.deleteArtist(potentivioAPI.getTokenArtist());
    }

    @When("user send GET Profile Artist request to potentivio but not login")
    public void userSendGETProfileArtistRequestToPotentivioButNotLogin() {
        potentivioAPI.unsuccessGetProfileArtist();
    }

    @When("user send GET Detail Artist request to potentivio but not login")
    public void userSendGETDetailArtistRequestToPotentivioButNotLogin() {
        potentivioAPI.unsuccessGetDetailArtist();
    }


    @And("user send POST video artist request to potentivio")
    public void postvideoArtist() {
        potentivioAPI.postVideoArtist(potentivioAPI.getTokenArtist());
        potentivioAPI.setTokenArtist();
    }

    @And("user send DELETE video artist request to potentivio")
    public void deletevideoArtist() {
        potentivioAPI.deleteVideoArtist(potentivioAPI.getTokenArtist());
        potentivioAPI.setTokenArtist();
    }
}
