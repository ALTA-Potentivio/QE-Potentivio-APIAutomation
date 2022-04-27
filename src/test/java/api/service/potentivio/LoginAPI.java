package api.service.potentivio;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class LoginAPI {

    private static final String POTENTIVIO_BASEURL = "https://potentivio.my.id";

    public void postLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "testing@gmail.com");
        bodyJSON.put("password", "testing");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }

    public void failedPostLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "testinggg@gmail.com");
        bodyJSON.put("password", "satria1234");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }

    public void postLoginCafeOwner() {
        JSONObject bodyJSON = new JSONObject();

        bodyJSON.put("email", "cafesemestasss@gmail.com");
        bodyJSON.put("password", "password123");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");
    }
}

