package api.stepdef;

import api.service.potentivio.ArtistAPI;
import io.cucumber.java.en.And;

public class ArtistStepDef {

    ArtistAPI artistAPI = new ArtistAPI();

    @And("user send GET All Artist request to potentivio")
    public void getallArtist() {
        artistAPI.getAllArtist();
    }

    @And("user send GET Profile Artist request to potentivio")
    public void getProfileArtist() {
        artistAPI.getProfileArtist();
    }

    @And("user send GET Detail Artist request to potentivio")
    public void getDetailArtist() {
        artistAPI.getDetailArtist();
    }

    @And("user send PUT Update Artist request to potentivio")
    public void putUpdateArtist() {
        artistAPI.putUpdateArtist();
    }
}
