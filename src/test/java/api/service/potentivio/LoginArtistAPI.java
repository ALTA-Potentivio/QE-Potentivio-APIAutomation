package api.service.potentivio;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class LoginArtistAPI {

    private static final String REQRESIN_BASEURL = "https://reqres.in";

    public void postLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "eve.holt@reqres.in");
        bodyJSON.put("password", "cityslicka");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(REQRESIN_BASEURL + "/api/login");
    }
}
