package api.service.potentivio;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class RegisterAPI {
    private static final String POTENTIVIO_BASEURL = "https://potentivio.my.id";

    public static void postRegisterArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "satria the star");
        bodyJSON.put("email", "satriaaaa4@gmail.com");
        bodyJSON.put("password", "satria123");
        bodyJSON.put("address", "jl. panglima no.11 - jakarta timur");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/artist");
    }

    public static void postRegisterCafeOwner() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("cafe_name", "coffee semesta");
        bodyJSON.put("owner", "satria");
        bodyJSON.put("email", "cafetest1234@gmail.com");
        bodyJSON.put("password", "password123");
        bodyJSON.put("address", "jl. yosudarso no.12 - jakarta utara");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/cafe");
    }
}
