package api.service;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import net.serenitybdd.rest.SerenityRest;

import org.json.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.RestRequests.given;

public class PotentivioAPI {
    private static final String POTENTIVIO_BASEURL = "https://potentivio.my.id";

    private String bearerToken;

    //Getters and Setters
    public String getTokenArtist() {
        return bearerToken;
    }

    //artist
    public void setTokenArtist() {

        RequestSpecification request = given();

        String payload = "{\n" +
                "    \"email\": \"testing6@gmail.com\",\n" +
                "    \"password\": \"testing\"\n" +
                "}";

        request.header("Content-Type", "application/json");
        Response responsePostMethod = request.body(payload)
                .post(POTENTIVIO_BASEURL + "/login/artist");

        responsePostMethod.prettyPeek();

        String jsonString = responsePostMethod.getBody().asString();
        int responseCode = responsePostMethod.statusCode();

        if (responseCode != 200) {
            this.bearerToken = "null";
        } else {
            this.bearerToken = JsonPath.from(jsonString).get("data.token");
        }
    }

    //Getters and Setters
    public String getTokenArtistDua() {
        return bearerToken;
    }

    //artist
    public void setTokenArtistDua() {

        RequestSpecification request = given();

        String payload = "{\n" +
                "    \"email\": \"testingQE2@gmail.com\",\n" +
                "    \"password\": \"testing\"\n" +
                "}";

        request.header("Content-Type", "application/json");
        Response responsePostMethod = request.body(payload)
                .post(POTENTIVIO_BASEURL + "/login/artist");

        responsePostMethod.prettyPeek();

        String jsonString = responsePostMethod.getBody().asString();
        int responseCode = responsePostMethod.statusCode();

        if (responseCode != 200) {
            this.bearerToken = "null";
        } else {
            this.bearerToken = JsonPath.from(jsonString).get("data.token");
        }
    }

    //Getters and Setters
    public String getTokenArtistTiga() {
        return bearerToken;
    }

    //artist
    public void setTokenArtistTiga() {

        RequestSpecification request = given();

        String payload = "{\n" +
                "    \"email\": \"testing8@gmail.com\",\n" +
                "    \"password\": \"testing\"\n" +
                "}";

        request.header("Content-Type", "application/json");
        Response responsePostMethod = request.body(payload)
                .post(POTENTIVIO_BASEURL + "/login/artist");

        responsePostMethod.prettyPeek();

        String jsonString = responsePostMethod.getBody().asString();
        int responseCode = responsePostMethod.statusCode();

        if (responseCode != 200) {
            this.bearerToken = "null";
        } else {
            this.bearerToken = JsonPath.from(jsonString).get("data.token");
        }
    }

    //Getters and Setters
    public String getTokenArtistEmpat() {
        return bearerToken;
    }

    //artist
    public void setTokenArtistEmpat() {

        RequestSpecification request = given();

        String payload = "{\n" +
                "    \"email\": \"testing9@gmail.com\",\n" +
                "    \"password\": \"testing\"\n" +
                "}";

        request.header("Content-Type", "application/json");
        Response responsePostMethod = request.body(payload)
                .post(POTENTIVIO_BASEURL + "/login/artist");

        responsePostMethod.prettyPeek();

        String jsonString = responsePostMethod.getBody().asString();
        int responseCode = responsePostMethod.statusCode();

        if (responseCode != 200) {
            this.bearerToken = "null";
        } else {
            this.bearerToken = JsonPath.from(jsonString).get("data.token");
        }
    }


    //cafe-owner

    public String getTokenCafeOwner() {
        return bearerToken;
    }

    public void setTokenCafeOwner() {

        RequestSpecification request = given();

        String payload = "{\n" +
                "    \"email\": \"testing-cafe2@gmail.com\",\n" +
                "    \"password\": \"testing-cafe\"\n" +
                "}";

        request.header("Content-Type", "application/json");
        Response responsePostMethod = request.body(payload)
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");

        responsePostMethod.prettyPeek();

        String jsonString = responsePostMethod.getBody().asString();
        int responseCode = responsePostMethod.statusCode();

        if (responseCode != 200) {
            this.bearerToken = "null";
        } else {
            this.bearerToken = JsonPath.from(jsonString).get("data.token");
        }
    }

    public String getTokenCafeOwnerDua() {
        return bearerToken;
    }

    public void setTokenCafeOwnerDua() {

        RequestSpecification request = given();

        String payload = "{\n" +
                "    \"email\": \"testing-cafe5@gmail.com\",\n" +
                "    \"password\": \"testing-cafe\"\n" +
                "}";

        request.header("Content-Type", "application/json");
        Response responsePostMethod = request.body(payload)
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");

        responsePostMethod.prettyPeek();

        String jsonString = responsePostMethod.getBody().asString();
        int responseCode = responsePostMethod.statusCode();

        if (responseCode != 200) {
            this.bearerToken = "null";
        } else {
            this.bearerToken = JsonPath.from(jsonString).get("data.token");
        }
    }

    //Register Artist
    public static void postRegisterArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "testing");
        bodyJSON.put("email", "testing5@gmail.com");
        bodyJSON.put("password", "testing");
        bodyJSON.put("address", "jakarta");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/artist");
    }


    // duplicate email Register Artist
    public static void duplicateRegisterArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "satria the star");
        bodyJSON.put("email", "satriaaaa44@gmail.com");
        bodyJSON.put("password", "satria123");
        bodyJSON.put("address", "jl. panglima no.11 - jakarta timur");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/artist");
    }


    // Register Artist Empty Email
    public void postRegisterArtistEmptyEmail() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "satria the rock");
        bodyJSON.put("email", "");
        bodyJSON.put("password", "testing");
        bodyJSON.put("address", "Jakarta");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/artist");
    }

    // Register Artist Empty Password
    public void postRegisterArtistEmptyPassword() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "satria the rock");
        bodyJSON.put("email", "satriaaaa44@gmail.com");
        bodyJSON.put("password", "");
        bodyJSON.put("address", "Jakarta");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/artist");
    }

    public void postRegisterArtistEmptyEmailPassword() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "satria the rock");
        bodyJSON.put("email", "");
        bodyJSON.put("password", "");
        bodyJSON.put("address", "Jakarta");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/artist");
    }


    // Register As Cafe Owner
    public static void postRegisterCafeOwner() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("cafe_name", "coffee semesta");
        bodyJSON.put("owner", "satria");
        bodyJSON.put("email", "testing-cafe3@gmail.com");
        bodyJSON.put("password", "password123");
        bodyJSON.put("address", "jl. yosudarso no.12 - jakarta utara");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/cafe");
    }


    // duplicate email Register Cafe Owner
    public static void failedRegisterAsCafe() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("cafe_name", "coffee semesta");
        bodyJSON.put("owner", "satria");
        bodyJSON.put("email", "cafetest1239@gmail.com");
        bodyJSON.put("password", "password12");
        bodyJSON.put("address", "jl. yosudarso no.12 - jakarta utara");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/cafe");
    }

    // Register Cafe Owner with empty email
    public void postRegisterCafeEmptyEmail() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "satria the rock");
        bodyJSON.put("email", "");
        bodyJSON.put("password", "123");
        bodyJSON.put("address", "Bandung");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/cafe");
    }

    // Register Cafe Owner with empty password
    public void postRegisterCafeEmptyPassword() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "satria the rock");
        bodyJSON.put("email", "cafetest1239@gmail.com");
        bodyJSON.put("password", "");
        bodyJSON.put("address", "Bandung");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/cafe");
    }

    public void postRegisterCafeEmptyEmailPassword() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("artist_name", "satria the rock");
        bodyJSON.put("email", "");
        bodyJSON.put("password", "");
        bodyJSON.put("address", "Bandung");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/cafe");
    }

    //Login Artist
    public void postLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "testingQE@gmail.com");
        bodyJSON.put("password", "testing123");


        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }


    public void wrongpasswordLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "testingQE@gmail.com");
        bodyJSON.put("password", "testing");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }

    public void emptypasswordLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "testingQE@gmail.com");
        bodyJSON.put("password", "");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }

    public void emptyemailLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "");
        bodyJSON.put("password", "testing123");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }

    public void wrongemailLoginArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "satriaabc@gmail.com");
        bodyJSON.put("password", "satria123");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }

    public void emptyemailpassArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "");
        bodyJSON.put("password", "");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }

    public void unregisteredArtist() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "abc@gmail.com");
        bodyJSON.put("password", "abcdef");


        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/artist");
    }

    //Login Cafe Owner
    public void postLoginCafeOwner() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "testing-cafe2@gmail.com");
        bodyJSON.put("password", "testing-cafe");


        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");
    }

    public void wrongpasswordloginCafeOwner() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "testing-cafe2@gmail.com");
        bodyJSON.put("password", "password12345");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");
    }

    public void wrongemailloginCafeOwner() {
        JSONObject bodyJSON = new JSONObject();

        bodyJSON.put("email", "testing@gmail.com");
        bodyJSON.put("password", "testing-cafe");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");
    }

    public void emptypasswordLoginACafeOwner() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "testing-cafe@gmail.com");
        bodyJSON.put("password", "");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");
    }

    public void emptyemailLoginCafeOwner() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "");
        bodyJSON.put("password", "testing-cafe");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");
    }

    public void emptyemailpassCafeOwner() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "");
        bodyJSON.put("password", "");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");
    }

    public void unregisteredCafeOwner() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("email", "cafe@gmail.com");
        bodyJSON.put("password", "abcdef");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .post(POTENTIVIO_BASEURL + "/login/cafe-owner");
    }

    //Artist
    public void getAllArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/artist");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/artist");
        }
        System.out.println(token);
    }

    public void unsuccessGetAllArtist() {
        SerenityRest.given()
                .get(POTENTIVIO_BASEURL + "/artist");
    }

    public void getProfileArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/artist/profile");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/artist/profile");
        }
        System.out.println(token);
    }

    public void unsuccessGetProfileArtist() {
        SerenityRest.given()
                .get(POTENTIVIO_BASEURL + "/artist/profile");
    }


    public void getDetailArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/artist/19");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/artist/19");
        }
        System.out.println(token);
    }

    public void unsuccessGetDetailArtist() {
        SerenityRest.given()
                .get(POTENTIVIO_BASEURL + "/artist/19");
    }

    public void putUpdateArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/artist/profile");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .header("Content-type", "multipart/form-data; boundary=<calculated when request is sent>")
                    .multiPart("id_catagory", "15")
                    .multiPart("id_genre", "1")
                    .multiPart("phone_number", "089525525505")
                    .multiPart("address", "Bandung")
                    .multiPart("id_category", "1")
                    .multiPart("id_genre", "1")
                    .multiPart("phone_number", "089525525505")
                    .multiPart("price", "600000")
                    .multiPart("description", "artis keren banget")
                    .multiPart("account_number", "01019191818")
                    .multiPart("avatar", new File("/Users/zatihulwani/Downloads/avatar/avatar2.png"))
                    .put(POTENTIVIO_BASEURL + "/artist/profile");
        }

        System.out.println(token);
    }

    public void deleteArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .delete(POTENTIVIO_BASEURL + "/artist/profile");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .delete(POTENTIVIO_BASEURL + "/artist/profile");
        }
        System.out.println(token);
    }

    //Video Artist
    public void postVideoArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/video/artist");
        } else {
            JSONObject bodyJSON = new JSONObject();
            bodyJSON.put("video_url", "youtube.com/testingapi123");

            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .post(POTENTIVIO_BASEURL + "/video/artist");
        }
        System.out.println(token);
    }

    public void deleteVideoArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .delete(POTENTIVIO_BASEURL + "/video/artist/1");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .delete(POTENTIVIO_BASEURL + "/video/artist/1");
        }
        System.out.println(token);
    }

    //Category Artist
    public void getAllCategory(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/category");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/category");
        }
        System.out.println(token);
    }

    public void unsuccessGetAllCategory() {
        SerenityRest.given()
                .get(POTENTIVIO_BASEURL + "/category");
    }

    public void postCategoryArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/category");
        } else {
            JSONObject bodyJSON = new JSONObject();
            bodyJSON.put("name_catagory", "Duo");
            SerenityRest.given()
                    .header("Content-type", "application/json")
                    .body(bodyJSON.toString())
                    .header("Authorization", "Bearer " + token)
                    .post(POTENTIVIO_BASEURL + "/category");
        }
        System.out.println(token);
    }

    //hire
    public void posthireArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/hire/105");
        } else {
            JSONObject bodyJSON = new JSONObject();
            bodyJSON.put("date", "2022-04-30T15:00:00Z0700");
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .post(POTENTIVIO_BASEURL + "/hire/105");

        }
        System.out.println(token);
    }

    public void posthireArtistTiga(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/hire/105");
        } else {
            JSONObject bodyJSON = new JSONObject();
            bodyJSON.put("date", "2022-04-30T15:00:00Z0700");
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .post(POTENTIVIO_BASEURL + "/hire/105");

        }
        System.out.println(token);
    }
    public void posthireArtistEmpat(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/hire/105");
        } else {
            JSONObject bodyJSON = new JSONObject();
            bodyJSON.put("date", "2022-04-30T15:00:00Z0700");
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .post(POTENTIVIO_BASEURL + "/hire/105");

        }
        System.out.println(token);
    }

    public void postacceptArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/accept/8");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .post(POTENTIVIO_BASEURL + "/accept/8");
        }
        System.out.println(token);
    }

    public void putrejectArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .put(POTENTIVIO_BASEURL + "/reject/8");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .put(POTENTIVIO_BASEURL + "/reject/8");
        }
        System.out.println(token);
    }

    public void putcancelArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .put(POTENTIVIO_BASEURL + "/cancel/8");
        } else {
            JSONObject bodyJSON = new JSONObject();
            bodyJSON.put("date", "2022-04-30T15:00:00Z0700");
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .put(POTENTIVIO_BASEURL + "/cancel/8");
        }
        System.out.println(token);
    }

    public void putratingArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .put(POTENTIVIO_BASEURL + "/rating/8");
        } else {
            JSONObject bodyJSON = new JSONObject();
            bodyJSON.put("rating", "5");
            bodyJSON.put("comment", "good performance");
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .put(POTENTIVIO_BASEURL + "/rating/8");
        }
        System.out.println(token);
    }

    public void putcafeDone(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .put(POTENTIVIO_BASEURL + "/payment/8");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .put(POTENTIVIO_BASEURL + "/payment/8");
        }
        System.out.println(token);
    }


    public void gethireArtist(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/hire/artist");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/hire/artist");
        }
        System.out.println(token);
    }

    public void gethireCafe(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/hire/artist");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/hire/cafe");
        }
        System.out.println(token);
    }


    public void postImageCafe(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/image/cafe");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .header("Content-type", "multipart/form-data; boundary=<calculated when request is sent>")
                    .multiPart("image_url", new File("/Users/zatihulwani/Downloads/cafe2.jpeg"))
                    .post(POTENTIVIO_BASEURL + "/image/cafe");
        }
        System.out.println(token);
    }

    public void deleteImageCafe(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .delete(POTENTIVIO_BASEURL + "/image/cafe/11");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .delete(POTENTIVIO_BASEURL + "/image/cafe/11");
        }
        System.out.println(token);
    }

    // Cafe

    public void getAllCafe(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/cafe");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/cafe");
        }
        System.out.println(token);
    }

    public void getProfilecafe(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/cafe/profile");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/cafe/profile");
        }
        System.out.println(token);
    }

    public void getDetailcafe(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/cafe/49");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/cafe/49");
        }
        System.out.println(token);
    }

    public void deleteCafe(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .delete(POTENTIVIO_BASEURL + "/cafe/profile");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                    .delete(POTENTIVIO_BASEURL + "/cafe/profile");
        }
        System.out.println(token);
    }

    public void putUpdateCafe(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .put(POTENTIVIO_BASEURL + "/cafe/profile");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .header("Content-type", "multipart/form-data; boundary=<calculated when request is sent>")
                    .multiPart("cafe_Name", "cafe belakang rumah")
                    .put(POTENTIVIO_BASEURL + "/cafe/profile");
        }

        System.out.println(token);
    }

    // Genre

    public void postCreateGenre(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/genre");
        } else {
            JSONObject bodyJSON = new JSONObject();
            bodyJSON.put("name_genre", "dangdut");
            SerenityRest.given()
                    .header("Content-type", "application/json")
                    .body(bodyJSON.toString())
                    .header("Authorization", "Bearer " + token)
                    .post(POTENTIVIO_BASEURL + "/genre");
        }
        System.out.println(token);
    }

    public void getAllGenre(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/genre");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/genre");
        }
        System.out.println(token);
    }

    public void postNotification(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .post(POTENTIVIO_BASEURL + "/offer/18");

        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .post(POTENTIVIO_BASEURL + "/offer/18");
        }
        System.out.println(token);
    }

    public void getAllNotification(String token) {
        if (token.equalsIgnoreCase("null")) {
            SerenityRest.given()
                    .get(POTENTIVIO_BASEURL + "/offer");
        } else {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(POTENTIVIO_BASEURL + "/offer");
        }
        System.out.println(token);
    }
}