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

    @When("user send GET All Artist request to potentivio but not login")
    public void userSendUnsuccessGETAllArtistRequestToPotentivio() {
        potentivioAPI.unsuccessGetAllArtist();
    }

    @And("user send GET Profile Artist request to potentivio")
    public void getProfileArtist() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.getProfileArtist(potentivioAPI.getTokenArtist());
    }

    @When("user send GET Profile Artist request to potentivio but not login")
    public void userSendGETProfileArtistRequestToPotentivioButNotLogin() {
        potentivioAPI.unsuccessGetProfileArtist();
    }

    @And("user send GET Detail Artist request to potentivio")
    public void getDetailArtist() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.getDetailArtist(potentivioAPI.getTokenCafeOwner());
    }

    @When("user send GET Detail Artist request to potentivio but not login")
    public void userSendGETDetailArtistRequestToPotentivioButNotLogin() {
        potentivioAPI.unsuccessGetDetailArtist();
    }

    @And("user send PUT Update Artist request to potentivio")
    public void putUpdateArtist() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.putUpdateArtist(potentivioAPI.getTokenArtist());
    }


    @When("user send DELETE Artist request to potentivio")
    public void userSendDELETEArtistRequestToPotentivio() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.deleteArtist(potentivioAPI.getTokenArtist());
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

    @When("user send GET All Category Artist request to potentivio")
    public void getAllCategoryArtist() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.getAllCategory(potentivioAPI.getTokenArtist());
    }

    @When("user send GET All Category Artist request to potentivio but not login")
    public void userSendGETAllCategoryArtistRequestToPotentivioButNotLogin() {
        potentivioAPI.unsuccessGetAllCategory();
    }

    @When("user send POST Create Category Artist request to potentivio")
    public void userSendPOSTCreateCategoryArtistRequestToPotentivio() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.postCategoryArtist(potentivioAPI.getTokenArtist());
    }

    @When("user send POST upload image cafe request to potentivio")
    public void userSendPOSTUploadImageCafeRequestToPotentivio() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.postImageCafe(potentivioAPI.getTokenCafeOwner());
    }

    @When("user send DELETE image cafe request to potentivio")
    public void userSendDELETEImageCafeRequestToPotentivio() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.deleteImageCafe(potentivioAPI.getTokenCafeOwner());
    }

    @When("user send GET All Cafe request to potentivio")
    public void userSendGETAllCafeRequestToPotentivio() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.getAllCafe(potentivioAPI.getTokenArtist());
    }

    @When("user send GET Profile Cafe request to potentivio")
    public void userSendGETProfileCafeRequestToPotentivio() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.getProfilecafe(potentivioAPI.getTokenCafeOwner());
    }

    @When("user send GET Detail Cafe by id request to potentivio")
    public void userSendGETDetailCafeRequestToPotentivio() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.getDetailcafe(potentivioAPI.getTokenCafeOwner());
    }

    @When("user send PUT Update Cafe request to potentivio")
    public void userSendPUTUpdateCafeRequestToPotentivio() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.putUpdateCafe(potentivioAPI.getTokenCafeOwner());
    }

    @When("user send DELETE Cafe request to potentivio")
    public void userSendDELETECafeRequestToPotentivio() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.deleteCafe(potentivioAPI.getTokenCafeOwner());
    }

    @When("user send POST Create Genre Music artist request to potentivio")
    public void userSendPOSTCreateGenreMusicArtistRequestToPotentivio() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.postCreateGenre(potentivioAPI.getTokenArtist());

    }

    @When("user send  Get All Genre Music artist request to potentivio")
    public void userSendGetAllGenreMusicArtistRequestToPotentivio() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.getAllGenre(potentivioAPI.getTokenArtist());
    }

    @When("user send POST Notification to Artist request to potentivio")
    public void userSendPOSTNotificationToArtistRequestToPotentivio() {
        potentivioAPI.setTokenArtist();
        potentivioAPI.postNotification(potentivioAPI.getTokenArtist());
    }

    @When("user send GET All Notification request to potentivio")
    public void userSendGETAllNotificationRequestToPotentivio() {
        potentivioAPI.setTokenCafeOwner();
        potentivioAPI.getAllNotification(potentivioAPI.getTokenCafeOwner());
    }
}
