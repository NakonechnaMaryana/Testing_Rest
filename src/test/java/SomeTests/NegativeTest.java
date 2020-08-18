package SomeTests;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class NegativeTest {
    @Test
    void author_resource() {
        when().
                get("http://localhost:8080/api/library/author/116").
                then().
                statusCode(200).
                body("authorId", equalTo(126),
                "authorDescription", equalTo("Ducimusaperiam similique. Quibusdam ullam odio minima dolores tenetur ipsum."
        ));
    }
}
