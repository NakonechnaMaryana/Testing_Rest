package SomeTests;

import org.testng.annotations.Test;
import utils.Constants;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void testStatus(){
        given().
                get(Constants.baseURI).
                then().
                statusCode(200);
    }
    @Test
    public void testLogging(){
        given().
                get(Constants.GET_BOOKS).
                then().
                statusCode(200).
                log().all();
    }
}
