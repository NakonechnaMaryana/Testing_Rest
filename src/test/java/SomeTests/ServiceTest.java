package SomeTests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ServiceTest {

    @Test
    void getAuthorTest() {
        RestAssured.basePath = "/api/library/author";
        Response response = given().contentType(ContentType.JSON).log().all()
                .get("/116");
        response.prettyPrint();

        JsonPath extractor = response.jsonPath();
        System.out.println (java.util.Optional.ofNullable(extractor.get("nationality")));
    }
    @Test
    void deleteBookTest() {
        RestAssured.basePath = "/api/library/book";
        Response response = given().contentType(ContentType.JSON).log().all()
                .delete("/7");
        response.prettyPrint();
    }
}

