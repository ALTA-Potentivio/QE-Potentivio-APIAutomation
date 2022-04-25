package api.service.potentivio;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class LoginArtistAPI {

    private static final String POTENTIVIO_BASEURL = "https://potentivio.my.id";

    public void postLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "satria@gmail.com");
        bodyJSON.put("password", "satria123");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }
}
