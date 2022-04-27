package api.service.potentivio;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import javax.mail.Multipart;
import java.io.File;

public class ArtistAPI {

    private static final String POTENTIVIO_BASEURL = "https://potentivio.my.id";

    public void getAllArtist() {
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJleHAiOjE2NTExMzE4MzgsImlkIjoxOSwibmFtZSI6InRlc3RpbmcifQ.zIkKrcRu9daJcQ1ouSnXwj9WzME6Oifcm4odSX-3Nb8")
                .get(POTENTIVIO_BASEURL + "/artist");
    }
    public void getProfileArtist() {
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJleHAiOjE2NTExMzE4MzgsImlkIjoxOSwibmFtZSI6InRlc3RpbmcifQ.zIkKrcRu9daJcQ1ouSnXwj9WzME6Oifcm4odSX-3Nb8")
                .get(POTENTIVIO_BASEURL + "/artist/profile");
    }

    public void getDetailArtist() {
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJleHAiOjE2NTExMzE4MzgsImlkIjoxOSwibmFtZSI6InRlc3RpbmcifQ.zIkKrcRu9daJcQ1ouSnXwj9WzME6Oifcm4odSX-3Nb8")
                .get(POTENTIVIO_BASEURL + "/artist/16");
    }

    public void putUpdateArtist() {

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJleHAiOjE2NTExMzE4MzgsImlkIjoxOSwibmFtZSI6InRlc3RpbmcifQ.zIkKrcRu9daJcQ1ouSnXwj9WzME6Oifcm4odSX-3Nb8")
                .header("Content-type", "multipart/form-data; boundary=<calculated when request is sent>")
                .multiPart("id_category", "1")
                .multiPart("id_genre", "1")
                .multiPart("phone_number", "089525525505")
                .multiPart("price", "600000")
                .multiPart("description", "artis keren banget")
                .multiPart("account_number", "01019191818")
                .multiPart("avatar", new File("/Users/zatihulwani/Downloads/avatar/avatar2.png"))
                .put(POTENTIVIO_BASEURL + "/artist/19");
    }


    }

