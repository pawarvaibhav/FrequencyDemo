package API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class GET_images_search {
    @Test
    public void GET_images_search() {
        when()
                .get("https://api.thedogapi.com/v1/images/search?size=med&mime_types=jpg&format=json&has_breeds=true&order=RANDOM&page=0&limit=1")
        .then()
                .statusCode(200);
    }
}
//git remote add origin
